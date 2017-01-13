package com.liu.mode.action.observer;

/**
 * Created by simon.liu on 2017/1/13.
 */
public interface Subject {
    /**
     *
     * @param observer observer
     */
    void add(Observer observer);

    /**
     *
     * @param observer observer
     */
    void del(Observer observer);

    /**
     * notify observers
     */
    void notifyObservers();

    /**
     * operation
     */
    void operation();
}
