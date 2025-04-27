DESCRIPTION = "Simple Hello World Kernel Module from Git"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

inherit module

SRC_URI = "git://github.com//Vinay046/hello-kernel.git;protocol=https;branch=main"
S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"

KERNEL_MODULE_AUTOLOAD += "hello"
