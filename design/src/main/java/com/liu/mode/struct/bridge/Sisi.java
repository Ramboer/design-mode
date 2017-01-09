package com.liu.mode.struct.bridge;

/**
 * Created by simon.liu on 2017/1/9.
 */
public abstract class Sisi {
    private SisiSpeak speak;

    /**
     * speak
     */
    public void speak() {
        speak.speak();
    }

    public SisiSpeak getSpeak() {
        return speak;
    }

    public void setSpeak(SisiSpeak speak) {
        this.speak = speak;
    }

}
