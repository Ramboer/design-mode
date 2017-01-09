package com.liu.mode.struct.decorator;

/**
 * Created by simon.liu on 2017/1/9.
 */
public class test {
    /**
     * test main
     * @param args String[]
     */
    public static void main(String[] args) {
        Source source = new Source();
        Decorator decorator = new Decorator(source);
        decorator.doSomething();
    }
}
