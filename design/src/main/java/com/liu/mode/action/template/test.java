package com.liu.mode.action.template;

/**
 * Created by simon.liu on 2017/1/13.
 */
public class test {
    /**
     * test main
     * @param args string
     */
    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator calculator = new Plus();
        int res = calculator.caculate(exp, "\\+");
        System.out.println(res);
    }
}
