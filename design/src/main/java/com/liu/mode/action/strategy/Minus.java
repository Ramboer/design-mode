package com.liu.mode.action.strategy;

/**
 * Created by simon.liu on 2017/1/10.
 */
public class Minus extends AbstractCalculator implements Strategy {
    /**
     * calculate
     * @param exp string
     * @return
     */
    public int calculate(String exp) {
        int[] array = split(exp, "\\-");
        return array[0] - array[1];
    }
}
