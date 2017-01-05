package com.liu.mode.create.fac;

/**
 * Created by simon.liu on 2017/1/5.
 */
public class test {
    /**
     * test main
     * @param args String[]
     */
    public static void main(String[] args) {
        Fruit apple = FruitFactory.createApple();
        Fruit banana = FruitFactory.createBanana();
        apple.color();
        apple.taste();
        banana.color();
        banana.taste();
    }
}
