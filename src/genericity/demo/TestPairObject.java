package genericity.demo;

/**
 * @author BastetCat
 * @data 2019/8/8 21:46
 */

public class TestPairObject {
    public static void main(String[] args) {
        PairObject pairObject1 = new PairObject(1,2);
        int one1 =(int)pairObject1.getOne();
        int two1 =(int)pairObject1.getTwo();
        System.out.println("one:"+one1+",two:"+two1);

        PairObject pairObject2 = new PairObject("yi","er");
        String one2 =(String)pairObject2.getOne();
        String two2 =(String)pairObject2.getTwo();
        System.out.println("one:"+one2+",two:"+two2);
    }
}
