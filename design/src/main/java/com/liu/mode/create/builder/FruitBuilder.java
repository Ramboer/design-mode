package com.liu.mode.create.builder;

import com.liu.mode.create.abstractfac.Apple;
import com.liu.mode.create.abstractfac.Banana;
import com.liu.mode.create.abstractfac.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by simon.liu on 2017/1/5.
 */
public class FruitBuilder {


    private  List<Fruit> fruits = new ArrayList<Fruit>();

    /**
     *
     * @param count int
     */
    public  void createApple(int count) {
       for (int i = 0; i < count; i++) {
           fruits.add(new Apple());
       }
    }

    /**
     *
     * @param count int
     */
    public  void createBanana(int count) {
        for (int i = 0; i < count; i++) {
            fruits.add(new Banana());
        }
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(List<Fruit> fruits) {
        this.fruits = fruits;
    }
}
