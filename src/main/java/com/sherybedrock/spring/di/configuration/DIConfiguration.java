package com.sherybedrock.spring.di.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sherybedrock.spring.di.services.EmailService;
import com.sherybedrock.spring.di.services.MessageService;

@Configuration
@ComponentScan(value={"com.sherybedrock.spring.di.consumer"})
public class DIConfiguration {

	@Bean
	public MessageService getMessageService(){
		return new EmailService();
	}
}
