package com.liu.mode.action.iterator;

/**
 * Created by simon.liu on 2017/1/13.
 */
public class MyIterator implements Iterator {
    private Collection collection;
    private int pos = -1;

    /**
     * constructor
     * @param collection collection
     */
    public MyIterator(Collection collection) {
        this.collection = collection;
    }

    /**
     * previous
     * @return
     */
    public Object previous() {
        if (pos > 0) {
            pos--;
        }
        return collection.get(pos);
    }

    /**
     * next
     * @return
     */
    public Object next() {
        if (pos < collection.size() - 1) {
            pos++;
        }
        return collection.get(pos);
    }

    /**
     * hasNext
     * @return
     */
    public boolean hasNext() {
        if (pos < collection.size() - 1) {
            return true;
        }
        return false;
    }

    /**
     * first
     * @return
     */
    public Object first() {
        pos = 0;
        return collection.get(pos);
    }
}
