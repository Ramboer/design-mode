package com.liu.mode.action.command;

/**
 * Created by simon.liu on 2017/1/16.
 */
public class test {
    /**
     * test main
     * @param args string
     */
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new MyCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
