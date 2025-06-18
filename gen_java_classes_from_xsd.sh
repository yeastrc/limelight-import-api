

#  Uses JAXB RI  XJC program to generate Java classes from the xsd file.

#  Use xjc from JDK.  It is a slightly older version in java 8 JDK but adequate

# /usr/lib/jvm/java-8-oracle/bin/

# windows one-liner
#xjc -d ..\src_java_jaxb_classes_from_xsd -p org.yeastrc.limelight.limelight_import.api.xml_dto ..\xsd/limelight-xml-v0.5.0.xsd


# unix command:
xjc \
  -d ../src_java_jaxb_classes_from_xsd \
  -p org.yeastrc.limelight.limelight_import.api.xml_dto  \
  ../xsd/limelight-xml-v0.8.0.xsd

# windows command:
"C:\Program Files\Java\jdk1.8.0_102\bin\xjc.exe" -d ..\src_java_jaxb_classes_from_xsd -p org.yeastrc.limelight.limelight_import.api.xml_dto ..\xsd/limelight-xml-v0.12.0.xsd

#e.g.
#"c:\Program Files\Java\jdk1.8.0_202\bin\xjc" -d ..\src_java_jaxb_classes_from_xsd -p org.yeastrc.limelight.limelight_import.api.xml_dto ..\xsd/limelight-xml-v0.9.0.xsd
