package com.liu.mode.action.mediator;

/**
 * Created by simon.liu on 2017/1/16.
 */
public class test {
    /**
     * test main
     * @param args string[]
     */
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
