package com.example.Alvative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlvativeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlvativeApplication.class, args);
	}

}
/*
* To build a payment platform using Java SpringBoot and Unirest, you can follow these steps:

Set up a SpringBoot project and add Unirest as a dependency in your pom.xml file.
*
Create a Paystack service class to handle the interaction with Paystack APIs.
*
Implement 2 Paystack APIs of your choice, such as Initialize Transaction and Verify Transaction.
*
Initialize Transaction API can be called when a user wants to initiate a payment and the response should include a reference code for the transaction.
*
Verify Transaction API can be used to confirm the success of a transaction using the reference code received from the Initialize Transaction API.
*
Test the payment platform by calling the APIs and verifying the responses.
*
*
*
* */