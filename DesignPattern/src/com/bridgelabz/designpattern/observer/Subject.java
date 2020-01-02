package com.bridgelabz.designpattern.observer;

public interface Subject {

	void subscribe(Subscriber sub);

	void unSubscribe(Observer sub);

	void notifySubscriber();

	void upload(String title);

}