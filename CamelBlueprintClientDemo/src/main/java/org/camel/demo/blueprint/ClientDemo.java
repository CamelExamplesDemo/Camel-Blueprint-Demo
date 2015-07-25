package org.camel.demo.blueprint;

import org.camel.demo.blueprint.service.IAccountService;

public class ClientDemo {

	private IAccountService accountService;
	
	public void startUp() {
		
		Account account = new Account();
		account.setAccountNo("123456789");
		account.setAccountName("RAMAKANTH");
		account.setAccountType("Savings");
		account.setAccountBalance("123456");
		
		accountService.saveAccountDetails(account);
	}

	public void setAccountService(IAccountService accountService) {
		this.accountService = accountService;
	}
	
}
