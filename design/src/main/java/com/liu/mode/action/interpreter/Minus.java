package com.liu.mode.action.interpreter;

/**
 * Created by simon.liu on 2017/1/16.
 */
public class Minus implements Expression{
    /**
     * interpret
     * @param context Context
     * @return
     */
    public int interpret(Context context) {
        return context.getNumOne() - context.getNumTwo();
    }
}
