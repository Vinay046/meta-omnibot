require ${COREBASE}/meta/recipes-core/images/core-image-minimal.bb

SUMMARY = "A small image just capable of starting core ROS."
DESCRIPTION = "${SUMMARY}"

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_DISTRO_TYPE}_image

IMAGE_INSTALL:append = " \
    ros-implicit-workspace \
    ros-core \
    linux-firmware \
    wireless-regdb-static \
    wpa-supplicant \
    iw \
    iproute2 \
    dhcpcd \
    networkmanager \
    networkmanager-wifi \
    dynamixel-sdk-examples \
    bluez5 \
    evtest \
    robot-control \
"
IMAGE_INSTALL:append = " \
    hello-kernel \
    fanctrl \
    "
