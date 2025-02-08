inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "ROS2 package to control motors"
AUTHOR = "Vinay Venkanagoud Patil <vinayvp.98@gmail.com>"
ROS_AUTHOR = "Vinay Venkanagoud Patil <vinayvp.98@gmail.com>"

SECTION = "devel"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "robot_control"
ROS_BPN = "robot_control"

ROS_BUILD_DEPENDS = " \
    dynamixel-sdk \
    robot-control-custom-interfaces \
    rclcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamixel-sdk \
    robot-control-custom-interfaces \
    rclcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamixel-sdk \
    robot-control-custom-interfaces \
    rclcpp \
    launch-ros \
    launch-xml \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH ?= "branch=main"
SRC_URI = "git://github.com//Vinay046/robot-control.git;protocol=https;${ROS_BRANCH}"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}