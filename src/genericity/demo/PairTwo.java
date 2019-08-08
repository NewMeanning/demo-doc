package genericity.demo;

/**
 * @author BastetCat
 * @data 2019/8/8 21:37
 */

public class PairTwo <U,V> {
    U one;
    V two;

    public PairTwo(U one, V two) {
        this.one = one;
        this.two = two;
    }

    public U getOne() {
        return one;
    }

    public V getTwo() {
        return two;
    }
}
