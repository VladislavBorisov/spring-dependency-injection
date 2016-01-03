package com.sherybedrock.spring.di.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sherybedrock.spring.di.configuration.DIConfiguration;
import com.sherybedrock.spring.di.consumer.MyApplication;

public class ClientApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		MyApplication app = context.getBean(MyApplication.class);
		
		app.processMessage("Hi sherybedrock", "vladislav.a.borisov@gmail.com");
		
		//close the context
		context.close();
	}

}
