# Agile Integration - Assignment

Agile Integration

This project facilitates the synchronization of master patient records across different healthcare providers. It is important to have consistent patient information across these multiple providers so that patients can receive consistent care. For that to occur, their personal and medical information must be shared. Additionally, updates to the patient record must flow across the providers to maintain accuracy and currency.

There are three sub projects as part of this project.

1. InBound:

This sub-project exposes RESTful CXF service that receives the patient record and converts the record to a XML and publish to the message Queue.

2. Xlate:

This sub-project is used to read the message published by the Inbound project from the message queue and convert to a different type of Object that is accepted by an external Webservice and publish the object as a XML to a different message queue.

3. OutBound:

This is the final sub-project that reads the message from the queue and invokes a call to the webservice operation.


To test the application:

<ul>
  <li>AMQ Broker needs to be started.</li>
  <li>Message Queues have to be created.</li>
  <li>The sub-projects have to be started in a certain sequence.</li>
  <li>Trigger the test data</li>    
</ul>


Starting the sub projects:

Step 1: Starting the Inbound Application:

Change the directory to the inbound.

```
cd ~/agileintegration/assignment/inbound
```
Compile the code:

```
mvn clean install -DskipTests
```
Start the application:

```
mvn spring-boot:run
```

After the application is started successfully, you will notice the below statements in the console log.

```
[main] INFO  o.s.b.c.e.u.UndertowEmbeddedServletContainer - Undertow started on port(s) 8082 (http)
.
.
[main] INFO  c.r.t.gpte.springboot.Application - Started Application in 5.95 seconds (JVM running for 9.162)
```

Step 2: Starting the Xlate Application:

Open another terminal window execute the below steps.

Change the directory to the xlate.

```
cd ~/agileintegration/assignment/xlate
```
Compile the code:

```
mvn clean install -DskipTests
```
Start the application:

```
mvn spring-boot:run
```

After the application is started successfully, you will notice the below statements in the console log.

```
[main] INFO  o.s.b.c.e.u.UndertowEmbeddedServletContainer - Undertow started on port(s) 8183 (http)
.
.
[main] INFO  c.r.t.gpte.springboot.Application - Started Application in 5.789 seconds (JVM running for 10.088)
```
