package com.liu.mode.create.prototype;

/**
 * Created by simon.liu on 2017/1/5.
 */
public class Apple implements Cloneable {
    /**
     *
     * @return Apple
     * @throws CloneNotSupportedException cloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException {
        Apple apple = (Apple) super.clone();
        return apple;
    }

    /**
     * test
     * @param args String[]
     */
    public static void main(String[] args) {
        Apple apple = new Apple();
        try {
            Apple apple1 = (Apple) apple.clone();
            System.out.println(apple.hashCode());
            System.out.println(apple1.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
