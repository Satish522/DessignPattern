package org.abstractfactory.factory;

import org.abstractfactory.IHardDisk;
import org.abstractfactory.IMonitor;
import org.abstractfactory.IProcessor;
import org.abstractfactory.impl.ExpensiveHDD;
import org.abstractfactory.impl.ExpensiveProcessor;
import org.abstractfactory.impl.HighResolutionMonitor;

public class HighBudgetMachine implements IMachineFactory {

	@Override
	public IProcessor GetRam() {
		// TODO Auto-generated method stub
		return new ExpensiveProcessor();
	}

	@Override
	public IHardDisk GetHardDisk() {
		// TODO Auto-generated method stub
		return new ExpensiveHDD(); 
	}

	@Override
	public IMonitor GetMonitor() {
		// TODO Auto-generated method stub
		return new HighResolutionMonitor();
	}
	 

}
