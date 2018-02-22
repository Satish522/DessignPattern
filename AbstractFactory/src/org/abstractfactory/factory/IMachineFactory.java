package org.abstractfactory.factory;

import org.abstractfactory.IHardDisk;
import org.abstractfactory.IMonitor;
import org.abstractfactory.IProcessor;

public interface IMachineFactory {
	public IProcessor GetRam();
    public IHardDisk GetHardDisk();
    public IMonitor GetMonitor();
}
