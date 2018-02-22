package com.journaldev.observer;

public class ObserverPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject topic=new MyTopic();
		
		Observer obs1=new MyTopicSubscriber("Observer 1");
		Observer obs2=new MyTopicSubscriber("Observer 2");
		Observer obs3=new MyTopicSubscriber("Observer 3");
		
		obs1.setSubject(topic);
		obs2.setSubject(topic);
		obs3.setSubject(topic);
		
		
		topic.register(obs1);
		topic.register(obs2);
		topic.register(obs3);
		
		MyTopic myTopic=(MyTopic) topic;
		
		myTopic.postMessage("Spring MVC going to Start");
	}

}
