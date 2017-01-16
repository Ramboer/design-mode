package com.liu.mode.action.interpreter;

/**
 * Created by simon.liu on 2017/1/16.
 */
public interface Expression {
    /**
     * interpret
     * @param context Context
     */
    int interpret(Context context);
}
