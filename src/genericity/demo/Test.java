package genericity.demo;

/**
 * @author BastetCat
 * @data 2019/8/8 21:22
 */

public class Test {
    public static void main(String[] args) {
        Pair<Integer> pairInteger =  new Pair<>(1,2);
        int one1 = pairInteger.getOne();
        int two1 = pairInteger.getTwo();
        System.out.println("one:"+one1+",two:"+two1);

        Pair<Character> pairCharacter  =  new Pair<>('一','二');
        char one2 = pairCharacter.getOne();
        char two2 = pairCharacter.getTwo();
        System.out.println("one:"+one2+",two:"+two2);

        Pair<String> pairString  =  new Pair<>("I","II");
        String one3 = pairString.getOne();
        String two3 = pairString.getTwo();
        System.out.println("one:"+one3+",two:"+two3);

    }
}
