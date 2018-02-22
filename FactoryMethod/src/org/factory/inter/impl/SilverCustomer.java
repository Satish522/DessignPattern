package org.factory.inter.impl;

import org.factory.intr.ICustomer;

public class SilverCustomer implements ICustomer {

	@Override
	public void addPoints() {
		// TODO Auto-generated method stub
		System.out.println("Silver Customer -  Points Added");
	}

	@Override
	public void addDiscount() {
		// TODO Auto-generated method stub
		System.out.println("Silver Customer - Discount Added");
	}
	
	public void SilverOperation()
    {
		System.out.println("Operation specific to Silver Customer");
    }

}
