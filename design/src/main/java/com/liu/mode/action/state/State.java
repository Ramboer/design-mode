package com.liu.mode.action.state;

/**
 * Created by simon.liu on 2017/1/16.
 */
public class State {
    private String value;

    /**
     * construction
     * @param value string
     */
    public State(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * state one
     */
    public void stateOne() {
        System.out.println("state one is execution...");
    }

    /**
     * state two
     */
    public void stateTwo() {
        System.out.println("state two is execution...");
    }
}
