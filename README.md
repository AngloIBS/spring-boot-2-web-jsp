# spring-boot-2-web-jsp
spring boot 2 web jsp demo

## Example will render "demo.jsp" passing value for parameter "myparam"
http://localhost:8080/test?myparam=Hello

## Run from command line

- explode war to folder, e.g. "demo.war" folder

```bash
tree view is like this:
+---META-INF
|   |   MANIFEST.MF
|   |
|   \---maven
|       \---com.zlatia.sb
|           \---demo
|                   pom.properties
|                   pom.xml
|
+---org
|   \---springframework
|       \---boot
|           \---loader
|               |   ExecutableArchiveLauncher.class
|               |   JarLauncher.class
|               |   LaunchedURLClassLoader$UseFastConnectionExceptionsEnumeration.class
|               |   LaunchedURLClassLoader.class
|               |   Launcher.class
|               |   MainMethodRunner.class
|               |   PropertiesLauncher$1.class
|               |   PropertiesLauncher$ArchiveEntryFilter.class
|               |   PropertiesLauncher$PrefixMatchingArchiveFilter.class
|               |   PropertiesLauncher.class
|               |   WarLauncher.class
|               |
|               +---archive
|               |       Archive$Entry.class
|               |       Archive$EntryFilter.class
|               |       Archive.class
|               |       ExplodedArchive$1.class
|               |       ExplodedArchive$FileEntry.class
|               |       ExplodedArchive$FileEntryIterator$EntryComparator.class
|               |       ExplodedArchive$FileEntryIterator.class
|               |       ExplodedArchive.class
|               |       JarFileArchive$EntryIterator.class
|               |       JarFileArchive$JarFileEntry.class
|               |       JarFileArchive.class
|               |
|               +---data
|               |       RandomAccessData.class
|               |       RandomAccessDataFile$1.class
|               |       RandomAccessDataFile$DataInputStream.class
|               |       RandomAccessDataFile$FileAccess.class
|               |       RandomAccessDataFile.class
|               |
|               +---jar
|               |       AsciiBytes.class
|               |       Bytes.class
|               |       CentralDirectoryEndRecord.class
|               |       CentralDirectoryFileHeader.class
|               |       CentralDirectoryParser.class
|               |       CentralDirectoryVisitor.class
|               |       FileHeader.class
|               |       Handler.class
|               |       JarEntry.class
|               |       JarEntryFilter.class
|               |       JarFile$1.class
|               |       JarFile$2.class
|               |       JarFile$JarFileType.class
|               |       JarFile.class
|               |       JarFileEntries$1.class
|               |       JarFileEntries$EntryIterator.class
|               |       JarFileEntries.class
|               |       JarURLConnection$1.class
|               |       JarURLConnection$JarEntryName.class
|               |       JarURLConnection.class
|               |       StringSequence.class
|               |       ZipInflaterInputStream.class
|               |
|               \---util
|                       SystemPropertyUtils.class
|
+---view
|       demo.jsp
|
\---WEB-INF
    +---classes
    |   |   application.properties
    |   |
    |   +---com
    |   |   \---demo
    |   |       \---sb
    |   |               DemoApplication.class
    |   |               TestController.class
    |   |
    |   \---static
    |           index.html
    |
    \---lib
            classmate-1.4.0.jar
            ecj-3.13.102.jar
            hibernate-validator-6.0.13.Final.jar
            jackson-annotations-2.9.0.jar
            jackson-core-2.9.7.jar
            jackson-databind-2.9.7.jar
            jackson-datatype-jdk8-2.9.7.jar
            jackson-datatype-jsr310-2.9.7.jar
            jackson-module-parameter-names-2.9.7.jar
            javax.annotation-api-1.3.2.jar
            jboss-logging-3.3.2.Final.jar
            jstl-1.2.jar
            jul-to-slf4j-1.7.25.jar
            log4j-api-2.11.1.jar
            log4j-to-slf4j-2.11.1.jar
            logback-classic-1.2.3.jar
            logback-core-1.2.3.jar
            slf4j-api-1.7.25.jar
            snakeyaml-1.23.jar
            spring-aop-5.1.3.RELEASE.jar
            spring-beans-5.1.3.RELEASE.jar
            spring-boot-2.1.2.BUILD-SNAPSHOT.jar
            spring-boot-autoconfigure-2.1.2.BUILD-SNAPSHOT.jar
            spring-boot-devtools-2.0.3.RELEASE.jar
            spring-boot-starter-2.1.2.BUILD-SNAPSHOT.jar
            spring-boot-starter-json-2.1.2.BUILD-SNAPSHOT.jar
            spring-boot-starter-logging-2.1.2.BUILD-SNAPSHOT.jar
            spring-boot-starter-tomcat-2.1.2.BUILD-SNAPSHOT.jar
            spring-boot-starter-web-2.0.3.RELEASE.jar
            spring-context-5.1.3.RELEASE.jar
            spring-core-5.1.3.RELEASE.jar
            spring-expression-5.1.3.RELEASE.jar
            spring-jcl-5.1.3.RELEASE.jar
            spring-web-5.1.3.RELEASE.jar
            spring-webmvc-5.1.3.RELEASE.jar
            tomcat-annotations-api-9.0.13.jar
            tomcat-embed-core-9.0.13.jar
            tomcat-embed-el-9.0.13.jar
            tomcat-embed-jasper-9.0.8.jar
            tomcat-embed-websocket-9.0.13.jar
            validation-api-2.0.1.Final.jar
```
            
- go to exploded folder root ("demo.war") and execute:

java -cp "WEB-INF/lib/*;WEB-INF/classes/." com.demo.sb.DemoApplication

- browse http://localhost:8080/test?myparam=Hello