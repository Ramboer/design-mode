package com.liu.mode.action.mediator;

/**
 * Created by simon.liu on 2017/1/16.
 */
public abstract class User {
    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    /**
     * construction
     * @param mediator Mediator
     */
    public User(Mediator mediator) {

        this.mediator = mediator;
    }

    /**
     * work
     */
    public abstract void work();
}
