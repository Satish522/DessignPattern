package org.factory.method;

import org.factory.intr.ICustomer;

public abstract class BaseCustomerFactory {
	public ICustomer getCustomer()
    {
        ICustomer myCust = this.CreateCustomer();
        myCust.addPoints();
        myCust.addDiscount();
        return myCust;
    }
    public abstract ICustomer CreateCustomer();
}
