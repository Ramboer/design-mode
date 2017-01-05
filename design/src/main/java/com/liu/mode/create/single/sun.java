package com.liu.mode.create.single;

/**
 * Created by simon.liu on 2017/1/5.
 */
final class Sun {

    private static Sun instance = null;
    private Sun() {

    }

    /**
     *
     * @return Sun
     */
    public static synchronized Sun getInstance() {
        if (instance == null) {
           instance = new Sun();
        }
        return instance;
    }
}
