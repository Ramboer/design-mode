package com.liu.mode.struct.object;

/**
 * Created by simon.liu on 2017/1/9.
 */
public class Wrapper implements Target {
    private Source source;

    /**
     * class constructor
     * @param source Source
     */
    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    /**
     * functionOne
     */
    public void functionOne() {
        source.functionOne();
    }

    /**
     * functionTwo
     */
    public void functionTwo() {
        System.out.println("this is functionTwo");
    }
}
