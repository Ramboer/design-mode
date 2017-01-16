package com.liu.mode.action.interpreter;

/**
 * Created by simon.liu on 2017/1/16.
 */
public class test {
    /**
     * test main
     * @param args string
     */
    public static void main(String[] args) {
        Context context = new Context(8, 6);
        Expression plus = new Plus();
        Expression minus = new Minus();
        int res = plus.interpret(context);
        System.out.println("plus res : " + res);
        res = minus.interpret(context);
        System.out.println("minus res : " + res);
    }
}
