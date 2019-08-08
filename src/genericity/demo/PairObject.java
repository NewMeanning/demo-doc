package genericity.demo;

/**
 * @author BastetCat
 * @data 2019/8/8 21:44
 */

public class PairObject {
    Object one;
    Object two;

    public PairObject(Object one, Object two) {
        this.one = one;
        this.two = two;
    }

    public Object getOne() {
        return one;
    }

    public Object getTwo() {
        return two;
    }
}
