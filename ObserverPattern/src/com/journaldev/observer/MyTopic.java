package com.journaldev.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {
	
	private List<Observer> observers;
	private String message;
	private Boolean change;
	private Object MUTEX=new Object();
	
	
	
	public MyTopic() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void register(Observer obj) {
		// TODO Auto-generated method stub
		if(obj==null) throw new NullPointerException("No Observer Found");
		synchronized (MUTEX) {
			if(!observers.contains(obj)) observers.add(obj);
		}
	}

	@Override
	public void unregister(Observer obj) {
		// TODO Auto-generated method stub
		synchronized (MUTEX) {
			observers.remove(obj);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		List<Observer> observerList;
		synchronized (MUTEX) {
			if(change) {
			observerList =new ArrayList<>(this.observers);
			this.change=false;
				for(Observer obs: observerList) {
					obs.update();
				}
			}
		}
	}

	@Override
	public Object getUpdate() {
		// TODO Auto-generated method stub
		return this.message;
	}
	
	//method to post message to the topic
		public void postMessage(String msg){
			System.out.println("Message Posted to Topic:"+msg);
			this.message=msg;
			this.change=true;
			notifyObservers();
		}
}
