package com.liu.mode.action.observer;

/**
 * Created by simon.liu on 2017/1/13.
 */
public class MySubject extends AbstractSubject {
    /**
     *
     */
    public void operation() {
        System.out.println("update self..");
        notifyObservers();
    }

    /**
     * test main
     * @param args string
     */
    public static void main(String[] args) {
        Subject subject = new MySubject();
        subject.add(new ObserverOne());
        subject.add(new ObserverTwo());
        subject.operation();
    }
}
