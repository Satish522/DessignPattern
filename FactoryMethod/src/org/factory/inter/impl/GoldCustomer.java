package org.factory.inter.impl;

import org.factory.intr.ICustomer;

public class GoldCustomer implements ICustomer {

	@Override
	public void addPoints() {
		// TODO Auto-generated method stub
		System.out.println("Gold Customer - Points Added");
	}

	@Override
	public void addDiscount() {
		// TODO Auto-generated method stub
		System.out.println("Gold Customer - Discounts Added");
	}
	
	public void GoldOperation()
    {
		System.out.println("Operation specific to Gold Customer");
    }

}
