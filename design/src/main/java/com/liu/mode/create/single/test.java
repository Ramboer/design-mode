package com.liu.mode.create.single;

/**
 * Created by simon.liu on 2017/1/5.
 */
public class test {
    /**
     * test
     * @param args String[]
     */
    public static void main(String[] args) {
        Sun sun = Sun.getInstance();
        Sun sun1 = Sun.getInstance();
        System.out.println(sun.hashCode());
        System.out.println(sun1.hashCode());
    }
}
