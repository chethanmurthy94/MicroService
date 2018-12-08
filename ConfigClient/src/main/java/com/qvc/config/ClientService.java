package com.qvc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class ClientService {

	@Value("${authentication.MemberNumberRegex10StartingWith0}")
	private String memberNumberRegex10StartingWith0;
	
	public String retriveCustomerValidationRegesFormat() {
		return memberNumberRegex10StartingWith0;
	}
}
