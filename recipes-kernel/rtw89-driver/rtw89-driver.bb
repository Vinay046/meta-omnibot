DESCRIPTION = "Out-of-tree Realtek rtw89 driver for RTL8852BE WiFi"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/lwfinger/rtw89.git;branch=main;protocol=https"

S = "${WORKDIR}/git"

inherit module

DEPENDS += "virtual/kernel"

# The key fix: provide the exact kernel module names that DNF is looking for
RPROVIDES:${PN} += "kernel-module-rtw89core-${KERNEL_VERSION}"
RPROVIDES:${PN} += "kernel-module-rtw89pci-${KERNEL_VERSION}"
RPROVIDES:${PN} += "kernel-module-rtw-8851b-${KERNEL_VERSION}"
RPROVIDES:${PN} += "kernel-module-rtw-8851be-${KERNEL_VERSION}"
RPROVIDES:${PN} += "kernel-module-rtw-8852a-${KERNEL_VERSION}"
RPROVIDES:${PN} += "kernel-module-rtw-8852ae-${KERNEL_VERSION}"
RPROVIDES:${PN} += "kernel-module-rtw-8852b-${KERNEL_VERSION}"
RPROVIDES:${PN} += "kernel-module-rtw-8852be-${KERNEL_VERSION}"
RPROVIDES:${PN} += "kernel-module-rtw-8852c-${KERNEL_VERSION}"
RPROVIDES:${PN} += "kernel-module-rtw-8852ce-${KERNEL_VERSION}"
RPROVIDES:${PN} += "kernel-module-rtw-8922a-${KERNEL_VERSION}"
RPROVIDES:${PN} += "kernel-module-rtw-8922ae-${KERNEL_VERSION}"

EXTRA_OEMAKE = " \
    KSRC=${STAGING_KERNEL_DIR} \
    KERNEL_SRC=${STAGING_KERNEL_DIR} \
    KCFLAGS='-Wno-error' \
"

do_install() {
    install -d ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/extra
    install -m 0644 *.ko ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/extra/
}

FILES:${PN} += "${nonarch_base_libdir}/modules/*/extra/*.ko"

# Add kernel module autoloading if needed
KERNEL_MODULE_AUTOLOAD += "rtw89core rtw89pci"