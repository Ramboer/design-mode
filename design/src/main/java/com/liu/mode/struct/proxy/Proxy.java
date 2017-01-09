package com.liu.mode.struct.proxy;

/**
 * Created by simon.liu on 2017/1/9.
 */
public class Proxy implements SourceAble {
    private Source source;
    /**
     * constructor
     */
    public Proxy() {
        super();
        source = new Source();
    }
    /**
     * function one
     */
    public void functionOne() {
        before();
        source.functionOne();
        after();
    }

    /**
     * before proxy
     */
    public void before() {
        System.out.println("before proxy");
    }

    /**
     * after proxy
     */
    public void after() {
        System.out.println("after proxy");
    }
}
