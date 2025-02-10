# meta-omnibot

## Overview

`meta-omnibot` is a Yocto meta-layer for the Omnibot robot from LTH. It provides ROS2 nodes to control and navigate the robot.

## Layer Dependencies

This layer depends on the following layers:

- `meta`
- `meta-poky`
- `meta-yocto-bsp`
- `meta-openembedded/meta-oe`
- `meta-openembedded/meta-networking`
- `meta-openembedded/meta-python`
- `meta-raspberrypi`
- `meta-ros/meta-ros/meta-ros-common`
- `meta-ros/meta-ros/meta-ros2`
- `meta-ros/meta-ros/meta-ros2-humble`

Ensure these layers are included in your `bblayers.conf` file.

## Recipes

The layer includes the following recipes:

### robot-control

A simple ROS2 node that initializes the dynamixel motors.

- **Description**: Initializes dynamixel motors.
- **Source**: [robot-control GitHub Repository](https://github.com/Vinay046/robot-control)
- **License**: MIT

### robot-control-custom-interfaces

Package that creates custom ROS2 messages to control multiple motors in one go.

- **Description**: ROS2 messages to control dynamixel motors.
- **Source**: [robot-control-custom-interfaces GitHub Repository](https://github.com/Vinay046/robot-control-custom-interfaces)
- **License**: MIT

### ros2-test

A simple ROS2 package that exposes launch files to operate robot.

- **Description**: ROS2 package to add custom apps.
- **Source**: [ros2-test GitHub Repository](https://github.com/Vinay046/ros2-test)
- **License**: MIT



## Setup Instructions

You will need repo tool to pull down all necessary repositories.

      repo init -u https://github.com/Vinay046/raspi-config.git -m manifest.xml -b omnibot
