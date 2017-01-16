package com.liu.mode.action.state;

/**
 * Created by simon.liu on 2017/1/16.
 */
public class test {
    /**
     * test main
     * @param args string
     */
    public static void main(String[] args) {
        State state = new State("one");
        Context context = new Context(state);
        context.operation();
        state.setValue("two");
        context.operation();

    }
}
