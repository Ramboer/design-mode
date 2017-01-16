package com.liu.mode.action.mediator;

/**
 * Created by simon.liu on 2017/1/16.
 */
public class MyMediator implements Mediator {
    private User userOne;
    private User userTwo;

    public User getUserOne() {
        return userOne;
    }

    public User getUserTwo() {
        return userTwo;
    }

    /**
     * create mediator
     */
    public void createMediator() {
        userOne = new UserOne(this);
        userTwo = new UserTwo(this);
    }

    /**
     * work all
     */
    public void workAll() {
        userOne.work();
        userTwo.work();
    }
}
