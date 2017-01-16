package com.liu.mode.action.interpreter;

/**
 * Created by simon.liu on 2017/1/16.
 */
public class Context {
    private int numOne;
    private int numTwo;
    public void setNumTwo(int numTwo) {
        this.numTwo = numTwo;
    }

    public int getNumTwo() {

        return numTwo;
    }

    public int getNumOne() {
        return numOne;
    }

    public void setNumOne(int numOne) {
        this.numOne = numOne;
    }

    /**
     * Construction
     * @param numOne int
     * @param numTwo int
     */
    public Context(int numOne, int numTwo) {
        this.numOne = numOne;
        this.numTwo = numTwo;

    }

}
