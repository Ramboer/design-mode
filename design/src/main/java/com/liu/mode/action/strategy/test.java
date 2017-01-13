package com.liu.mode.action.strategy;

/**
 * Created by simon.liu on 2017/1/10.
 */
public class test {
    /**
     * test main
     * @param args String[]
     */
    public static void main(String[] args) {
        String exp = "8+8";
        Strategy strategy = new Plus();
        int res = strategy.calculate(exp);
        System.out.println(res);
    }
}
