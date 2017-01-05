package com.liu.mode.create.abstractfac;

/**
 * Created by simon.liu on 2017/1/5.
 */
public class test {
    /**
     * test abstract fac
     * @param args String[]
     */
    public static void main(String[] args) {
        FruitFactory fruitFactory = new AppleFactory();
        Fruit apple = fruitFactory.createFruit();
        apple.color();
        apple.taste();
    }
}
