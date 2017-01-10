package com.liu.mode.action;

/**
 * Created by simon.liu on 2017/1/10.
 */
public class Mutiply extends AbstractCalculator implements Strategy {
    /**
     * calculate
     * @param exp string
     * @return
     */
    public int calculate(String exp) {
        int[] array = split(exp, "\\*");
        return array[0] * array[1];
    }
}
