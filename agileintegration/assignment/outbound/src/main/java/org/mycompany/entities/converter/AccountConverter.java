package org.mycompany.entities.converter;

import org.apache.camel.Converter;
import org.apache.camel.Exchange;

import com.nextgate.ws.entities.Account;
import com.nextgate.ws.entities.Company;
import com.nextgate.ws.entities.Contact;
import com.nextgate.ws.entities.ExecuteMatchUpdate;
import com.nextgate.ws.entities.SystemPerson;

@Converter
public class AccountConverter {
	@Converter
    public static Account toExecuteMatchUpdate(ExecuteMatchUpdate executeMatchUpdate, Exchange exchange) {
      
		
		Account account = new Account();
		Company company = new Company();
		Contact contact = new Contact();
		
		company.setActive(Boolean.TRUE);
		company.setGeo("NA");
		company.setName("Charlie Chaplin");
		
		SystemPerson person = executeMatchUpdate.getSysObjBean();
		contact.setCity(person.getCity());
		contact.setFirstName(person.getFirstName());
		contact.setLastName(person.getLastName());
		contact.setPhone(person.getPhone());
		contact.setState(person.getState());
		contact.setStreetAddr(person.getStreetAddr());
		contact.setZip(person.getZip());
		
		account.setClientId(0);
		account.setCompany(company);
		account.setContact(contact);
		
        return account;
    }
}
