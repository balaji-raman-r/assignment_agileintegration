package inbound.test;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.mycompany.entities.Patient;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InboundFlowTest extends CamelSpringTestSupport{	
	
	@Override
	public void setUp() throws Exception {
	    super.setUp();
	}

    
    @EndpointInject(uri = "mock:out")
    protected MockEndpoint resultEndpoint;

    @Produce(uri = "direct:rest5") 
    private ProducerTemplate startEndpoint;
    
    
   /**
    * Testcase for checking the message count that is send to the result Endpoint.
    * 
    * @throws Exception
    */
    @Test
    public void testMessageCount() throws Exception {
    	resultEndpoint.expectedMessageCount(1);
		Patient patient = new Patient();
		patient.setId("11111");
		patient.setName("Mickey Mouse");
		patient.setFirstName("Mickey");
		patient.setLastName("Mouse");
		patient.setPhone("1234-567-890");
		patient.setCity("New York");
		patient.setState("New York");
		patient.setZip("23456");
		startEndpoint.sendBody(patient);
	    resultEndpoint.assertIsSatisfied();
    }
    
	@Test 
	public void testJAXBOutput() throws Exception {
	    
		Patient patient = new Patient();
		patient.setId("11111");
		patient.setName("Mickey Mouse");
		patient.setFirstName("Mickey");
		patient.setLastName("Mouse");
		patient.setPhone("1234-567-890");
		patient.setCity("New York");
		patient.setState("New York");
		patient.setZip("23456");
				
		JAXBContext contextObj = JAXBContext.newInstance(Patient.class);  
	        
		Marshaller marshallerObj = contextObj.createMarshaller();  
		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
		StringWriter sw = new StringWriter();
		marshallerObj.marshal(patient, sw);
		
		resultEndpoint.expectedBodiesReceived(sw.toString());
	   
	    startEndpoint.sendBody(patient);		
	    resultEndpoint.assertIsSatisfied(); 
	   
	}
	
	@Test
	public void testValidation() throws Exception {
		
		String invalidJson = null;
		String expectedOutput = "The input data is invalid. Please provide a valid data.";	
		
		String actualOutput = startEndpoint.requestBody("direct:rest4", invalidJson, String.class);
	
		
		assertEquals(expectedOutput, actualOutput);
		
		
		
	}
	
	 @Override 
	protected AbstractXmlApplicationContext createApplicationContext() {
	        return new ClassPathXmlApplicationContext("spring/camel-context.xml");
	}

}
