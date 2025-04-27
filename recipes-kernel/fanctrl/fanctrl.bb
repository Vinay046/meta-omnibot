DESCRIPTION = "Fan control kernel module with trace prints"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

inherit module

SRC_URI = "git://github.com/Vinay046/fanctrl.git;protocol=https;branch=main"
S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"

EXTRA_OEMAKE = "KERNEL_SRC=${STAGING_KERNEL_BUILDDIR}"

KERNEL_MODULE_AUTOLOAD += "fanctrl"
