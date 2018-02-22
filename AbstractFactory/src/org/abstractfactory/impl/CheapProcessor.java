package org.abstractfactory.impl;

import org.abstractfactory.IProcessor;

public class CheapProcessor implements IProcessor {

	@Override
	public void performOperation() {
		// TODO Auto-generated method stub
		System.out.println("Operation will perform slowly");
	}

}
