package com.liu.mode.create.builder;

import com.liu.mode.create.abstractfac.Fruit;

/**
 * Created by simon.liu on 2017/1/5.
 */
public class test {
    /**
     * test
     * @param args String[]
     */
    public static void main(String[] args) {
        FruitBuilder fruitBuilder = new FruitBuilder();
        fruitBuilder.createApple(10);
        for (Fruit apple : fruitBuilder.getFruits()) {
            System.out.println("apple " + apple.hashCode());
            apple.color();
            apple.taste();
        }
    }

}
