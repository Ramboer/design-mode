package com.liu.mode.action.memento;

/**
 * Created by simon.liu on 2017/1/16.
 */
public class Storage {
    private Memento memento;

    /**
     * construction
     * @param memento memento
     */
    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
