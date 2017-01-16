package com.liu.mode.action.state;

/**
 * Created by simon.liu on 2017/1/16.
 */
public class Context {
    private State state;

    /**
     * construction
     * @param state State
     */
    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    /**
     * operation
     */
    public void operation() {
        if (state.getValue().equals("one")) {
            state.stateOne();
        } else if (state.getValue().equals("two")) {
            state.stateTwo();
        }
    }
}
