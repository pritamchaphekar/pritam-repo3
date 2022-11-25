package com.abm.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abm.component.HelloWorld;
import com.abm.component.WelcomeWorld;

public class App2 {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		
		WelcomeWorld ww = (WelcomeWorld) ctx.getBean("welcome");
		System.out.println("Main nahi toh kon be..");
		System.out.println("Welcome to the world of spring");
	}

}
