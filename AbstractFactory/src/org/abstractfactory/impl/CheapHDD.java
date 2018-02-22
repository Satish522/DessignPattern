package org.abstractfactory.impl;

import org.abstractfactory.IHardDisk;

public class CheapHDD implements IHardDisk {

	@Override
	public void StoreData() {
		// TODO Auto-generated method stub
		System.out.println("Data will take more time to store");
	}

}
