package com.liu.mode.action.responsibility;

/**
 * Created by simon.liu on 2017/1/13.
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
