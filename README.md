# assignment_agileintegraion

Agile Integration

This project facilitates the synchronization of master patient records across different healthcare providers. It is important to have consistent patient information across these multiple providers so that patients can receive consistent care. For that to occur, their personal and medical information must be shared. Additionally, updates to the patient record must flow across the providers to maintain accuracy and currency.

There are three sub projects as part of this project.

1. InBound:

This sub-project exposes RESTful CXF service that receives the patient record and converts the record to a XML and publish to the message Queue.

2. Xlate:

This sub-project is used to read the message published by the Inbound project from the message queue and convert to a different type of Object that is accepted by an external Webservice and publish the object as a XML to a different message queue.

3. OutBound:

This is the final sub-project that reads the message from the queue and invokes a call to the webservice operation.


