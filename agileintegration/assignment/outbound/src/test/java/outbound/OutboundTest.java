package outbound;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nextgate.ws.entities.CallerInfo;
import com.nextgate.ws.entities.ExecuteMatchUpdate;
import com.nextgate.ws.entities.SystemPerson;

public class OutboundTest extends CamelSpringTestSupport{	
	
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
    public void testUnMarshal() throws Exception{

    	ExecuteMatchUpdate mockObject = getExecuteMatchUpdateMock();
    	
    	String xmlString = getXMLString(mockObject);
    	System.out.println("Output............");
    	System.out.println(xmlString);
    	
        JAXBContext contextObj = JAXBContext.newInstance(ExecuteMatchUpdate.class);  
        Unmarshaller jaxbUnmarshaller = contextObj.createUnmarshaller();
        ExecuteMatchUpdate executeMtchUpdate = (ExecuteMatchUpdate) jaxbUnmarshaller.unmarshal(new StringReader(xmlString));
        

        
       // resultEndpoint.expectedBodiesReceived(mockObject);
        resultEndpoint.setExpectedCount(1);
        
        startEndpoint.sendBody(xmlString);
        
        System.out.println(resultEndpoint.getExchanges().get(0).toString());
		resultEndpoint.assertIsSatisfied();
    	
    }
    
   private ExecuteMatchUpdate getExecuteMatchUpdateMock() {
	   ExecuteMatchUpdate executeMatchUpdate = new ExecuteMatchUpdate();        
       CallerInfo callerInfo = new CallerInfo();
       callerInfo.setUser("user_1");
       SystemPerson systemPerson = new SystemPerson();
       systemPerson.setLocalId("1");
       executeMatchUpdate.setCallerInfo(callerInfo);
       executeMatchUpdate.setSysObjBean(systemPerson);
       
       return executeMatchUpdate;
	   
   }
    
    private String getXMLString(ExecuteMatchUpdate executeMatchUpdate) throws Exception{
       
        JAXBContext contextObj = JAXBContext.newInstance(ExecuteMatchUpdate.class);  
        
		Marshaller marshallerObj = contextObj.createMarshaller();  
		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
		StringWriter sw = new StringWriter();
		marshallerObj.marshal(executeMatchUpdate, sw);
		return sw.toString();
    	
    }
    	
	@Override 
	protected AbstractXmlApplicationContext createApplicationContext() {
	        return new ClassPathXmlApplicationContext("spring/camel-context.xml");
	}

}
