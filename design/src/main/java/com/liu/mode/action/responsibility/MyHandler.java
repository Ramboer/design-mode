package com.liu.mode.action.responsibility;

/**
 * Created by simon.liu on 2017/1/13.
 */
public class MyHandler extends AbstractHandler implements Handler{
    private String name;

    /**
     * constructor
     * @param name string
     */
    public MyHandler(String name) {
        this.name = name;
    }
    /**
     * operator
     */
    public void operator() {
        System.out.println(name + "deal..");
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
