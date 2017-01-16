package com.liu.mode.action.command;

/**
 * Created by simon.liu on 2017/1/16.
 */
public class MyCommand implements Command {
    private Receiver receiver;

    /**
     * construction
     * @param receiver Receiver
     */
    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    /**
     * my execute
     */
    public void exe() {
        receiver.action();
    }
}
