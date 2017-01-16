package com.liu.mode.action.visitor;

/**
 * Created by simon.liu on 2017/1/16.
 */
public class MyVisitor implements Visitor {
    /**
     * visit
     * @param subject subject
     */
    public void visit(Subject subject) {
        System.out.println("i " + subject.getSubject() + " you !");
    }
}
