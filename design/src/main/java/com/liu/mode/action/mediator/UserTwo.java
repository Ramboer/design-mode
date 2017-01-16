package com.liu.mode.action.mediator;

/**
 * Created by simon.liu on 2017/1/16.
 */
public class UserTwo extends User {

    /**
     * construction
     *
     * @param mediator Mediator
     */
    public UserTwo(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user two execution...");
    }
}
