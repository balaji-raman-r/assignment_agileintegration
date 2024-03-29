# Agile Integration - Assignment

Agile Integration

This project facilitates the synchronization of master patient records across different healthcare providers. It is important to have consistent patient information across these multiple providers so that patients can receive consistent care. For that to occur, their personal and medical information must be shared. Additionally, updates to the patient record must flow across the providers to maintain accuracy and currency.

There are three sub projects as part of this project.

1. Inbound:

This sub-project exposes RESTful CXF service that receives the patient record and converts the record to a XML and publish to the message Queue.

2. Xlate:

This sub-project is used to read the message published by the Inbound project from the message queue and convert to a different type of Object that is accepted by an external Webservice and publish the object as a XML to a different message queue.

3. Outbound:

This is the final sub-project that reads the message from the queue and invokes a call to the webservice operation.


To test the application, please ensure the following:

<ul>
  <li>AMQ Broker is started and the connection parameters are updated in the properties file.</li>
  <li>
    The following message queues are created.
    <ul>
      <li>patient</li>
      <li>q.empi.nextgate.out</li>
    </ul>
  </li>
  <li>The sub-projects (Inbound, Xlate, Outbound) are started in separate terminal windows.</li>
  <li>The test web service is started and it is up and running.</li>
  <li>Trigger the REST API Call with the test data.</li>    
</ul>

Download the source code locally to the home directory.

```
cd ~

git clone https://github.com/balaji-raman-r/assignment_agileintegration.git

```

Starting the sub projects:

Step 1: Starting the Inbound Application:

Change the directory to the inbound.

```
cd ~/assignment_agileintegration/agileintegration/assignment/inbound
```
Compile the code:

```
mvn clean install -DskipTests
```
Start the application:

```
mvn spring-boot:run
```

After the application is started successfully, you will notice the below mentioned similar statements in the console log.

```
[main] INFO  o.s.b.c.e.u.UndertowEmbeddedServletContainer - Undertow started on port(s) 8082 (http)
.
.
[main] INFO  c.r.t.gpte.springboot.Application - Started Application in 5.95 seconds (JVM running for 9.162)
```

Step 2: Starting the Xlate Application:

Open a new terminal window execute the below steps.

Change the directory to the xlate.

```
cd ~/assignment_agileintegration/agileintegration/assignment/xlate
```
Compile the code:

```
mvn clean install -DskipTests
```
Start the application:

```
mvn spring-boot:run
```

After the application is started successfully, you will notice the below mentioned similar statements in the console log.

```
[main] INFO  o.s.b.c.e.u.UndertowEmbeddedServletContainer - Undertow started on port(s) 8183 (http)
.
.
[main] INFO  c.r.t.gpte.springboot.Application - Started Application in 5.789 seconds (JVM running for 10.088)
```

Step 3: Starting the Outbound Application:

Open a new terminal window execute the below steps.

Change the directory to the outbound.

```
cd ~/assignment_agileintegration/agileintegration/assignment/outbound
```
Build the project:

```
mvn clean install -DskipTests
```
Start the application:

```
mvn spring-boot:run
```

After the application is started successfully, you will notice the below mentioned similar statements in the console log.

```
[main] INFO  o.s.b.c.e.u.UndertowEmbeddedServletContainer - Undertow started on port(s) 8184 (http)
.
.
[main] INFO  c.r.t.gpte.springboot.Application - Started Application in 6.906 seconds (JVM running for 11.086)
```

Step 4: Starting the Backend SOAP Test Application:

Open a new terminal window execute the below steps.

Change the directory to the soap-backend-service.

```
cd ~/assignment_agileintegration/agileintegration/assignment/soap-backend-service
```
Build the project:

```
mvn install -Dfabric8.skip=true
```
Start the application:

```
mvn camel:run -Dfabric8.skip=true
```
After the application is started successfully, you will notice the below mentioned similar statements in the console log.

```
org.apache.camel.spring.Main.main() INFO [org.eclipse.jetty.server.Server] - Started @7444ms
org.apache.camel.spring.Main.main() INFO [org.eclipse.jetty.server.handler.ContextHandler] - Started o.e.j.s.h.ContextHandler@4524622b{/ws,null,AVAILABLE}
org.apache.camel.spring.Main.main() INFO [org.apache.camel.spring.SpringCamelContext] - Route: _route1 started and consuming from: Endpoint[cxf://bean:customerWebService]
org.apache.camel.spring.Main.main() INFO [org.apache.camel.spring.SpringCamelContext] - Total 1 routes, of which 1 are started.
org.apache.camel.spring.Main.main() INFO [org.apache.camel.spring.SpringCamelContext] - Apache Camel 2.17.0.redhat-630224 (CamelContext: _camelContext1) started in 0.964 seconds
```

Testing the Application:

Invoke the REST API exposed by the Inbound Application by executing the below command(s). Three data files are given for the testing.

Open a new terminal window and switch to the data directory and execute the following command(s) to test the flow.

The test data is provided in the data directory.

Change to the data directory

```
cd ~/assignment_agileintegration/agileintegration/assignment/data

```

Invoke the REST API using the sample data.

```
curl -k -d@patient1.json -X POST http://localhost:8181/rest/patient/update --header "Content-Type: application/json"

curl -k -d@patient2.json -X POST http://localhost:8181/rest/patient/update --header "Content-Type: application/json"

curl -k -d@patient3.json -X POST http://localhost:8181/rest/patient/update --header "Content-Type: application/json"

```

To test the validation:

```
curl -k -d@patient-nofile.json -X POST http://localhost:8181/rest/patient/update --header "Content-Type: application/json"
```


To run the unit tests:

Switch to the project directory of inbound/xlate/outbound.

Execute the below command.

```
mvn test
```
