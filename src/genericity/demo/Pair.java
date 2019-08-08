package genericity.demo;

/**
 * @author BastetCat
 * @data 2019/8/8 21:14
 */

public class Pair<T> {
    T one;
    T two;

    public Pair(T one, T two) {
        this.one = one;
        this.two = two;
    }

    public T getOne() {
        return one;
    }

    public T getTwo() {
        return two;
    }
}
