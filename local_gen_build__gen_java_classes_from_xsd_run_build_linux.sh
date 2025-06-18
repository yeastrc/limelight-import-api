#!/bin/bash

set -e  #  exit on first error

#  ONLY for local testing.   Only on Linux, only tested on Ubuntu.

#  When push change to Github an Action will run to do the same thing. Action:  'push.yaml'



#  Uses JAXB RI  XJC program to generate Java classes from the xsd file.

#  Use xjc from JDK.  It is a slightly older version in java 8 JDK but adequate

# /usr/lib/jvm/java-8-oracle/bin/

rm -rf src_java_jaxb_classes_from_xsd && mkdir src_java_jaxb_classes_from_xsd

# linux command:
xjc \
  -d src_java_jaxb_classes_from_xsd \
  -p org.yeastrc.limelight.limelight_import.api.xml_dto  \
  xsd/limelight-xml.xsd

#  run gradle build
./gradlew build

