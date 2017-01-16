package com.liu.mode.action.visitor;

/**
 * Created by simon.liu on 2017/1/16.
 */
public interface Subject {
    /**
     * accept
     * @param visitor visitor
     */
    void accept(Visitor visitor);

    /**
     *
     * @return
     */
    String getSubject();
}
