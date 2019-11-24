package xlate;

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

import com.nextgate.ws.entities.CallerInfo;
import com.nextgate.ws.entities.ExecuteMatchUpdate;
import com.nextgate.ws.entities.SystemPerson;

public class XlateTest extends CamelSpringTestSupport{	
	
	@Override
	public void setUp() throws Exception {
	    super.setUp();
	}

    
    @EndpointInject(uri = "mock:out")
    protected MockEndpoint resultEndpoint;

    @Produce(uri = "direct:route1-mock:in") 
    private ProducerTemplate startEndpoint;
    
    @EndpointInject(uri = "mock:out")
    protected MockEndpoint resultEndpoint2;

    @Produce(uri = "direct:mock:in") 
    private ProducerTemplate startEndpoint2;
    
    @EndpointInject(uri = "mock:out")
    protected MockEndpoint resultEndpoint3;

    @Produce(uri = "direct:route3-mock:in") 
    private ProducerTemplate startEndpoint3;
    
    @Test
    public void testTypeConversionCount() throws Exception{
    	   	    	
    	Patient person = new Patient();
		person.setId("1");
		person.setName("test");
		
        resultEndpoint2.setExpectedCount(1);
        startEndpoint2.sendBody(person);
		
        resultEndpoint2.assertIsSatisfied();		
    	
    }
    
    
    @Test
    public void testMarshalling() throws Exception{
		
		ExecuteMatchUpdate executeMatchUpdate = new ExecuteMatchUpdate();        
        CallerInfo callerInfo = new CallerInfo();
        callerInfo.setUser("user_1");
        SystemPerson systemPerson = new SystemPerson();
        systemPerson.setLocalId("1");
        executeMatchUpdate.setCallerInfo(callerInfo);
        executeMatchUpdate.setSysObjBean(systemPerson);
       
        JAXBContext contextObj = JAXBContext.newInstance(ExecuteMatchUpdate.class);  
        
		Marshaller marshallerObj = contextObj.createMarshaller();  
		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
		StringWriter sw = new StringWriter();
		marshallerObj.marshal(executeMatchUpdate, sw);
        
        resultEndpoint3.expectedBodiesReceived(sw.toString());
        startEndpoint3.sendBody(executeMatchUpdate);

        resultEndpoint3.assertIsSatisfied();
    	
    }
    
    
    @Test
    public void testUnMarshalXMLToJava() throws Exception{

    	Patient person = new Patient();
		person.setId("1");
		person.setName("test");
		
		resultEndpoint.expectedBodiesReceived(person);
		
		JAXBContext contextObj = JAXBContext.newInstance(Patient.class);  
		Marshaller marshallerObj = contextObj.createMarshaller();  
		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
		StringWriter sw = new StringWriter();
		marshallerObj.marshal(person, sw);
						
		startEndpoint.sendBody(sw.toString());
    	resultEndpoint.assertIsSatisfied();
    	
    }
    	
	@Override 
	protected AbstractXmlApplicationContext createApplicationContext() {
	        return new ClassPathXmlApplicationContext("spring/camel-context.xml");
	}

}
