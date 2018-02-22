package org.factory.client;

import org.factory.intr.ICustomer;
import org.factory.method.BaseCustomerFactory;
import org.factory.method.GoldCustomerFactory;

public class MainClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCustomerFactory c = new GoldCustomerFactory();// Or new SilverCustomerFactory();
		ICustomer objCust = c.getCustomer();
		
	}

}
