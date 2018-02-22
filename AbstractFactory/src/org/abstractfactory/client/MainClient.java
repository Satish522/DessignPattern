package org.abstractfactory.client;

import org.abstractfactory.IHardDisk;
import org.abstractfactory.factory.HighBudgetMachine;
import org.abstractfactory.factory.IMachineFactory;

public class MainClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMachineFactory factory = new HighBudgetMachine();
		factory.GetHardDisk().StoreData();
		factory.GetMonitor().DisplayPicture();
		factory.GetRam().performOperation();
		
	}

}
