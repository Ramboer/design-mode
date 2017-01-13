package com.liu.mode.action.template;

/**
 * Created by simon.liu on 2017/1/13.
 */
public abstract class AbstractCalculator {
    /**
     *
     * @param exp string
     * @param opt string
     * @return
     */
    public final int caculate(String exp, String opt) {
        int[] arrayint = spilt(exp, opt);
        return caculate(arrayint[0], arrayint[1]);
    }

    /**
     *
     * @param num1 int
     * @param num2 int
     * @return
     */
    public abstract int caculate(int num1, int num2);

    /**
     *
     * @param exp string
     * @param opt string
     * @return
     */
    public final int[] spilt(String exp, String opt) {
        String[] array = exp.split(opt);
        int[] arryint = new int[2];
        arryint[0] = Integer.parseInt(array[0]);
        arryint[1] = Integer.parseInt(array[1]);
        return arryint;
    }
}
