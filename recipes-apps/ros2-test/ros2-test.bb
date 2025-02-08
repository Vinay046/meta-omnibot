inherit ros_distro_humble
inherit ros_superflore_generated

AUTHOR = "Vinay Venkanagoud Patil"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=82f0323c08605e5b6f343b05213cf7cc"


ROS_CN = "ros2_test"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    rclcpp-components \
    rcutils \
    rmw \
    rmw-implementation-cmake \
    std-msgs \
    geometry-msgs \
    sensor-msgs \
    rosidl-default-generators \
    libeigen \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    launch-ros \
    launch-xml \
    rclcpp \
    rclcpp-components \
    rcutils \
    rmw \
    std-msgs \
    geometry-msgs \
    sensor-msgs \
    rosidl-default-generators \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH ?= "main"
SRC_URI = "git://github.com//Vinay046/ros2-test.git;protocol=ssh;branch=main"
SRCREV = "affc544d04abaa8e5a98240fc1fc0cdf82173bfa"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}