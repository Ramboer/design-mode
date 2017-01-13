package com.liu.mode.action.iterator;

/**
 * Created by simon.liu on 2017/1/13.
 */
public interface Collection {
    /**
     * iterator
     * @return
     */
    com.liu.mode.action.iterator.Iterator iterator();

    /**
     *
     * @param i int
     * @return
     */
    Object get(int i);

    /**
     * size
     * @return
     */
    int size();
}
