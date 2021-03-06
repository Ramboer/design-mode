package com.liu.mode.action.strategy;

/**
 * Created by simon.liu on 2017/1/10.
 */
public abstract class AbstractCalculator {
    /**
     * split
     * @param exp string
     * @param opt string
     * @return int[] ...
     */
    public int[ ] split(String exp, String opt) {
        String[ ] array = exp.split(opt);
        int[ ] arrayInt = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
