package com.liu.mode.action.iterator;

/**
 * Created by simon.liu on 2017/1/13.
 */
public interface Iterator {
    /**
     * previous
     * @return
     */
    Object previous();

    /**
     * next
     * @return
     */
    Object next();

    /**
     * hasNext
     * @return
     */
    boolean hasNext();

    /**
     * first
     * @return
     */
    Object first();
}
