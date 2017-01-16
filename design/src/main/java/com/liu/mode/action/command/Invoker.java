package com.liu.mode.action.command;

/**
 * Created by simon.liu on 2017/1/16.
 */
public class Invoker {
    private Command command;

    /**
     *
     * @param command command
     */
    public Invoker(Command command) {
        this.command = command;
    }

    /**
     * action
     */
    public void action() {
        command.exe();
    }
}
