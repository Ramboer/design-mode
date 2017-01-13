package com.liu.mode.action.iterator;

/**
 * Created by simon.liu on 2017/1/13.
 */
public class MyCollection implements Collection{

    private String[] string = {"A", "B", "C", "D", "E"};

    /**
     * iterator
     * @return
     */
    public Iterator iterator() {
        return new MyIterator(this);
    }

    /**
     *
     * @param i int
     * @return
     */
    public Object get(int i) {
        return string[i];
    }

    /**
     * size
     * @return
     */
    public int size() {
        return string.length;
    }
}
