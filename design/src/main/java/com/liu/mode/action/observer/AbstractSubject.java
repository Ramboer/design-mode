package com.liu.mode.action.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by simon.liu on 2017/1/13.
 */
public abstract class AbstractSubject implements Subject {
    private Vector<Observer> observers = new Vector<Observer>();

    /**
     * add
     * @param observer observer
     */
    public void add(Observer observer) {
        observers.add(observer);
    }

    /**
     * del
     * @param observer observer
     */
    public void del(Observer observer) {
        observers.remove(observer);
    }

    /**
     * notifyObservers
     */
    public void notifyObservers() {
        Enumeration<Observer> observerEnumeration = observers.elements();
        while (observerEnumeration.hasMoreElements()) {
            observerEnumeration.nextElement().update();
        }
    }
}
