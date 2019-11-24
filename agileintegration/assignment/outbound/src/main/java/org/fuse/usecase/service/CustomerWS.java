package org.fuse.usecase.service;



import javax.jws.WebService;

import com.nextgate.ws.entities.Account;
import com.nextgate.ws.entities.CorporateAccount;

@WebService
public interface CustomerWS {

    CorporateAccount updateAccount(Account account);

}
