package com.liu.mode.create.abstractfac;

/**
 * Created by simon.liu on 2017/1/5.
 */
public class BananaFactory implements FruitFactory {
    /**
     *
     * @return Fruit
     */
    public Fruit createFruit() {
        return new Banana();
    }
}
