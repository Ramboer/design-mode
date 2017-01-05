package fac;

/**
 * Created by simon.liu on 2017/1/5.
 */
public class FruitFactory {
    /**
     * create apple
     * @return apple
     */
    public static Fruit createApple() {
        Fruit apple = new Apple();
        return apple;
    }

    /**
     * create banana
     * @return banana
     */
    public static Fruit createBanana() {
       Fruit banana = new Banana();
        return  banana;
    }
}
