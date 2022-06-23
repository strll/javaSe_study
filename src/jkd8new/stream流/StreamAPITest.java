package jkd8new.stream流;

import jkd8new.函数式接口.Persion;
import org.junit.Test;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamAPITest {
    @Test
    public void test(){
        ArrayList<Persion> objects = new ArrayList<>();

        Persion persion = new Persion("a", "b");
        Persion persion1 = new Persion("a1", "b1");
        Persion persion2 = new Persion("a2", "b2");
        Persion persion3 = new Persion("a3", "b3");
        objects.add( persion );
        objects.add( persion1 );
        objects.add( persion2 );
        objects.add( persion3 );

        Stream<Persion> stream = objects.stream(); //普通流
        Stream<Persion> persionStream = objects.parallelStream();//顺序流



    }
}
