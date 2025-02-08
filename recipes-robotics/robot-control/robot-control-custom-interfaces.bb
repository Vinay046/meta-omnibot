inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "ROS2 custom interface for omnibot"
AUTHOR = "Vinay Venkanagoud Patil <vinayvp.98@gmail.com>"
ROS_AUTHOR = "Vinay Venkanagoud Patil <vinayvp.98@gmail.com>"

SECTION = "devel"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=02488d5860f66720fa7d833af2b208a6"

ROS_CN = "robot_control"
ROS_BPN = "robot_control_custom_interfaces"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
    rosidl-default-runtime \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH ?= "branch=main"
SRC_URI = "git://github.com//Vinay046/robot-control-custom-interfaces.git;protocol=https;${ROS_BRANCH}"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}