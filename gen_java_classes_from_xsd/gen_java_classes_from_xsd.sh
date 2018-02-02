

#  Uses JAXB RI  XJC program to generate Java classes from the xsd file.

#  Use xjc from JDK.  It is a slightly older version in java 8 JDK but adequate

# /usr/lib/jvm/java-8-oracle/bin/

xjc \
  -d ../src_java_jaxb_classes_from_xsd \
  -p org.yeastrc.emozi.emozi_import.api.xml_dto  \
  ../xsd/emozi-xml-v0.1.0.xsd


