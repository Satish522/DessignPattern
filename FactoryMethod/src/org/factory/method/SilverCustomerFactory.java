package org.factory.method;

import org.factory.inter.impl.SilverCustomer;
import org.factory.intr.ICustomer;

public class SilverCustomerFactory extends BaseCustomerFactory {

	@Override
	public ICustomer CreateCustomer()
    {
        SilverCustomer objCust = new SilverCustomer();
        objCust.SilverOperation();
        return objCust;
    }

}
