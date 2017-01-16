package com.liu.mode.action.memento;

/**
 * Created by simon.liu on 2017/1/16.
 */
public class Memento {
    private String value;

    /**
     * construction
     * @param value String
     */
    public Memento(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}
