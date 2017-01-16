package com.liu.mode.action.visitor;

/**
 * Created by simon.liu on 2017/1/16.
 */
public class MySubject implements Subject {
    /**
     *
     * @param visitor visitor
     */
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getSubject() {
        return "love";
    }
}
