# Xlate Project

This sub-project is used to read the message published by the Inbound project from the message queue and convert to a different type of Object that is accepted by an external Webservice and publish the object as a XML to a different message queue.

The application utilizes the Spring to load a Camel Context definition via a [camel-context.xml](src/main/resources/spring/camel-context.xml) file on the classpath.

**IMPORTANT**: This project runs as a standalone application on your machine. 

## Building

The project can be built with

    mvn clean install -DskipTests

### To execute the Unit Test Cases:

You can execute the test cases as follows.

Obtain the project and enter the project's directory.
Execute the below command to run the test cases:

```
$ mvn test
```



### Running the Xlate standalone on your machine

You can run this application as a standalone project directly:

Obtain the project and enter the project's directory
Build the project:

```
$ mvn clean install -DskipTests
$ mvn spring-boot:run 
```
