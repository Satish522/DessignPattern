package org.factory.method;

import org.factory.inter.impl.GoldCustomer;
import org.factory.intr.ICustomer;

public class GoldCustomerFactory extends BaseCustomerFactory {

	@Override
	public ICustomer CreateCustomer()
    {
        GoldCustomer objCust = new GoldCustomer();
        objCust.GoldOperation();
        return objCust;
    }

}
