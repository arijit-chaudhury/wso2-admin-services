package com.example.wso2adminservice.config;

import javax.net.ssl.TrustManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.http.HttpsUrlConnectionMessageSender;

import com.example.wso2adminservice.service.Wso2AddUser;

@Configuration
public class Wso2SoapClientConfig {
	
	@Value("${wso2.admin.url}")
	private String uri;
	
	@Value("${wso2.admin.generated.contextpath}")
	private String contextPath;
	
	@Value("${wso2.admin.userid}")
	private String userId;
	
	@Value("${wso2.admin.password}")
	private String password;

	@Bean
	public Jaxb2Marshaller marshaller() {
		final Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath(contextPath);
		return marshaller;
	}

	@Bean
	public HttpsUrlConnectionMessageSender httpsUrlConnectionMessageSender() {
		HttpsUrlConnectionMessageSender sender = new BasicAuthHttpsConnectionMessageSender(userId, password);
		sender.setTrustManagers(new TrustManager[] { new UnTrustworthyTrustManager() });
		return sender;
	}

	@Bean
	public WebServiceTemplate webServiceTemplate() {
		WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
		webServiceTemplate.setMarshaller(marshaller());
		webServiceTemplate.setUnmarshaller(marshaller());
		webServiceTemplate.setDefaultUri(uri);
		webServiceTemplate.setMessageSender(httpsUrlConnectionMessageSender());
		return webServiceTemplate;
	}

	/*
	@Bean
	public Wso2AddUser addUser() {
		Wso2AddUser addUser = new Wso2AddUser();
		addUser.setDefaultUri(uri);
		addUser.setMarshaller(marshaller());
		addUser.setUnmarshaller(marshaller());
		return addUser;
	}
	*/

}
