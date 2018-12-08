package com.qvc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ClientController {
	
	@Value("${authentication.validation.message.invalidOrMissingCustomerNumber}")
	private String invalidOrMissingCustomerNumber;
	
	@Autowired
	private ClientService clientService;
	
	@GetMapping(value="/message")
	public String getMessage() {
		return invalidOrMissingCustomerNumber;
	}
	
	@GetMapping(value="/regex")
	public String getRegex() {
		return clientService.retriveCustomerValidationRegesFormat();
	}

}
