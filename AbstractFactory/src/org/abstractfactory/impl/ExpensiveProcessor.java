package org.abstractfactory.impl;

import org.abstractfactory.IProcessor;

public class ExpensiveProcessor implements IProcessor {

	@Override
	public void performOperation() {
		// TODO Auto-generated method stub
		System.out.println("Operation will perform quickly");
	}

}
