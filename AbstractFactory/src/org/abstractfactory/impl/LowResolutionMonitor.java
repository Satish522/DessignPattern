package org.abstractfactory.impl;

import org.abstractfactory.IMonitor;

public class LowResolutionMonitor implements IMonitor {

	@Override
	public void DisplayPicture() {
		// TODO Auto-generated method stub
		System.out.println("Picture quality is Average");
	}
}
