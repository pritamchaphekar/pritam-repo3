package com.abm.component.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hdatm")
public class HdfcAtm implements Atm {

    @Autowired
	private Bank bank;
    
	public void withdraw(int acno, double amount) {
		// TODO Auto-generated method stub
		
		System.out.println("User at hdfcAtm wanting to withdraw " + amount);
		bank.withdraw(121, amount);
		
	}

	
}
