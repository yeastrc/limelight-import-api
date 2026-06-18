
# limelight-import-api
Included in this repository are the schema definition for Limelight XML files and
Java code for simplifying the creation of software to create Limelight XML files.

Version 2.0.0 — Breaking Change for Converter Code (No XSD Changes)
--------------------
**Release 2.0.0 migrates this API from JAXB 2 (the `javax.xml.bind` namespace) to
JAXB 3.0 (the `jakarta.xml.bind` namespace).**

**There are NO changes to the Limelight XML schema (XSD).** The XML format is
unchanged: Limelight XML written by 1.x and by 2.0.0 is identical and fully
interoperable in both directions, and all existing Limelight XML files remain
valid. This is purely a Java-API (namespace) change, not a data-format change —
the major version was bumped only because it is a source-incompatible change for
code that uses the convenience classes.

**The jar is still built for Java 8**, so converter programs do **not** need a
newer Java runtime.

### What breaks and how to fix it (converter / producer code)

Code that uses the Java convenience classes will no longer compile until you:

1. **Update imports** in your converter: `javax.xml.bind.*` → `jakarta.xml.bind.*`
   (e.g. `javax.xml.bind.JAXBContext` → `jakarta.xml.bind.JAXBContext`).

2. **Update your JAXB dependency** to JAXB 3.0 (jakarta), still Java 8 compatible:

   ```
   implementation 'jakarta.xml.bind:jakarta.xml.bind-api:3.0.1'
   implementation 'org.glassfish.jaxb:jaxb-runtime:3.0.2'
   ```

3. **Recompile.** No Java version change is required — JAXB 3.0 runs on Java 8.

> Note for programs that *read/deserialize* Limelight XML (e.g. the importer): a
> newer `org.glassfish.jaxb:jaxb-runtime:4.0.x` runtime also works (it binds these
> jakarta-3.0 classes), so consumers on newer Java can use the latest JAXB.

Download
--------------------
The XSD file for the schema may be downloaded by following the ``xsd`` link
above. The compiled Java archive that includes convenience classes for
generating the schema may be downloaded from https://github.com/yeastrc/limelight-import-api/releases
