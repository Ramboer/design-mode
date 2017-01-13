package com.liu.mode.action.iterator;

/**
 * Created by simon.liu on 2017/1/13.
 */
public class tets {
    /**
     * test main
     * @param args string[]
     */
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
