package jkd8new;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

public class LambdaTest {
    @Test
    public void noargs(){
        Runnable run1=new Runnable(){

            @Override
            public void run() {
                System.out.println("旧方法");
            }
        };

        Runnable run2=()->{
            System.out.println("lambda表达式");
        };
        run2.run();
    }
@Test
    public void haveArgs(){
        Consumer<String> call = new Consumer<String>(){
            @Override
            public void accept(String s) {
                System.out.println(s);
            };
        };
        call.accept("a1");
    Consumer<String> call1 =(s)-> System.out.println(s);
    call1.accept("a2");
}
@Test
    public void haveTwoArgsAndReturn(){
        Comparator<Integer> com =new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }

        };
    Comparator<Integer> com2=(o1,o2)->{
        System.out.println(o1);
        System.out.println(o2);
        return o1-o2;
    };
    System.out.println(com2.compare(12,13));
}
}
