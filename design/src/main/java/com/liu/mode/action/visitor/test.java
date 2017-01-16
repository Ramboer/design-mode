package com.liu.mode.action.visitor;

/**
 * Created by simon.liu on 2017/1/16.
 */
public class test {
    /**
     * test main
     * @param args string[]
     */
    public static void main(String[] args) {
        Visitor myVisitor = new MyVisitor();
        Subject subject = new MySubject();
        subject.accept(myVisitor);
    }
}
