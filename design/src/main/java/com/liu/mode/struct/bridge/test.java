package com.liu.mode.struct.bridge;

/**
 * Created by simon.liu on 2017/1/9.
 */
public class test {
    /**
     * test main
     * @param args String[]
     */
    public static void main(String[] args) {
        Sisi sisi = new MySisi();
        sisi.setSpeak(new SpeakOne());
        sisi.speak();

        sisi.setSpeak(new SpeakTwo());
        sisi.speak();
    }
}
