package com.liu.mode.action.memento;

/**
 * Created by simon.liu on 2017/1/16.
 */
public class Original {
    private String value;

    /**
     * Construction
     * @param value String
     */
    public Original(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
     *
     * @return
     */
    public Memento createMemento() {
        return new Memento(value);
    }

    /**
     * restore memento
     * @param memento Memento
     */
    public void restoreMemento(Memento memento) {
        this.value = memento.getValue();
    }

}
