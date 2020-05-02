package com.example.wso2adminservice.service;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.example.wso2adminservice.generate.ws.AddUser;
import com.example.wso2adminservice.generate.ws.ObjectFactory;

@Component
public class Wso2AddUser extends WebServiceGatewaySupport {
	@Autowired
	private WebServiceTemplate webServiceTemplate;

	public void addUser(String username, String password) {
		ObjectFactory objectFactory = new ObjectFactory();
		AddUser addUser = objectFactory.createAddUser();

		JAXBElement<String> createAddUserUserName = objectFactory.createAddUserUserName(username);
		JAXBElement<String> createAddUserProfileName = objectFactory.createAddUserProfileName("default");
		JAXBElement<String> createAddUserCredential = objectFactory.createAddUserCredential(password);
		String role = "Internal/subscriber";
		
		addUser.setCredential(createAddUserCredential);
		addUser.setProfileName(createAddUserProfileName);
		addUser.setRequirePasswordChange(false);
		addUser.setUserName(createAddUserUserName);
		addUser.getRoleList().add(role);
		try {
			webServiceTemplate.marshalSendAndReceive(addUser);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

}
