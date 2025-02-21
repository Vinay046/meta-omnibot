SUMMARY = "ROS implicit workspace profile script"
DESCRIPTION = "Installs a profile script to source the ROS setup automatically."
PV = "1.0"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=143947c31d5112be84e50ec2f900c543"

BRANCH ?= "branch=main"
SRC_URI = "git://github.com/Vinay046/ros-implicit-workspace.git;protocol=https;${BRANCH}"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"


do_install () {
    install -d ${D}${sysconfdir}/profile.d
    install -m 0755 ${S}/ros-implicit-workspace.sh ${D}${sysconfdir}/profile.d/ros-implicit-workspace.sh
}

FILES_${PN} += "${sysconfdir}/profile.d/ros-implicit-workspace.sh"
