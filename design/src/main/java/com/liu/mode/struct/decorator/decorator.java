package com.liu.mode.struct.decorator;

/**
 * Created by simon.liu on 2017/1/9.
 */
public class Decorator implements SourceAble {

    private Source source;

    /**
     * do something
     * @param source Source
     */

    public Decorator(Source source) {
        super();
        this.source = source;
    }

    /**
     * do something
     */
    public void doSomething() {
        System.out.println("before do something.");
        source.doSomething();
        System.out.println("after do something.");
    }
}
