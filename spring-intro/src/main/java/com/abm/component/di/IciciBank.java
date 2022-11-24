package com.abm.component.di;

import org.springframework.stereotype.Component;

@Component
public class IciciBank implements Bank {

	public void withdraw(int acno, double amount) {
		// TODO Auto-generated method stub
		
		System.out.println("User of IciciBank wanting to withdraw" + amount);
		
	}

}
