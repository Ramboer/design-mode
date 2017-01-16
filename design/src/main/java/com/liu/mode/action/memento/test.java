package com.liu.mode.action.memento;

/**
 * Created by simon.liu on 2017/1/16.
 */
public class test {
    /**
     * test main
     * @param args String[]
     */
    public static void main(String[] args) {
        Original original = new Original("egg");
        Storage storage = new Storage(original.createMemento());
        System.out.println("old : " + original.getValue());
        original.setValue("apple");
        System.out.println("new : " + original.getValue());

        original.restoreMemento(storage.getMemento());
        System.out.println("old : " + original.getValue());
    }
}
