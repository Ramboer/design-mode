package com.liu.mode.struct.object;

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
        Target target = new Wrapper(source);
        target.functionOne();
        target.functionTwo();
    }
}
