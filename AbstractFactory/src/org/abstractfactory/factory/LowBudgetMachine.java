package org.abstractfactory.factory;

import org.abstractfactory.IHardDisk;
import org.abstractfactory.IMonitor;
import org.abstractfactory.IProcessor;
import org.abstractfactory.impl.CheapHDD;
import org.abstractfactory.impl.CheapProcessor;
import org.abstractfactory.impl.LowResolutionMonitor;

public class LowBudgetMachine implements IMachineFactory {

	@Override
	public IProcessor GetRam() {
		// TODO Auto-generated method stub
		return new CheapProcessor();
	}

	@Override
	public IHardDisk GetHardDisk() {
		// TODO Auto-generated method stub
		return new CheapHDD();
	}

	@Override
	public IMonitor GetMonitor() {
		// TODO Auto-generated method stub
		return new LowResolutionMonitor();
	}

}
