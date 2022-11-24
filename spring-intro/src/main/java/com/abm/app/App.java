package com.abm.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abm.component.Calculator;
import com.abm.component.HelloWorld;
import com.abm.component.TextEditor;
import com.abm.component.WelcomeWorld;
import com.abm.component.di.HdfcAtm;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		
		
		for(int i=0; i<10; i++ ) {
		HelloWorld hw = (HelloWorld) ctx.getBean("hello");
		System.out.println("Pritam_Bhai");
		}
		
		
		WelcomeWorld ww = (WelcomeWorld) ctx.getBean("welcome");
		System.out.println("Main nahi toh kon be..");
		
		Calculator c = (Calculator) ctx.getBean("calc");
		c.add(10, 500);
		c.sub(20, 10);
		
		
		TextEditor te = (TextEditor) ctx.getBean("txtEdtr");
		te.loadDocument("Check kar diya na chacha maine file ko");
		
		HdfcAtm hf = (HdfcAtm) ctx.getBean("hdatm");
		hf.withdraw(223, 34567.44);
	}

}
