# Outbound Project

This is the final sub-project that consumes the message from the queue and invokes a call to the web service operation.

The application utilizes the Spring annotation to load a Camel Context definition via a [camel-context.xml](src/main/resources/spring/camel-context.xml) file on the classpath.

**IMPORTANT**: This application runs in standalone mode on your machine. 

## Building

The example can be built with

    mvn clean install -DskipTests

### Running the application as standalone on your machine


Obtain the project and enter the project's directory
Build the project:

```
$ mvn clean package
$ mvn spring-boot:run 
```


