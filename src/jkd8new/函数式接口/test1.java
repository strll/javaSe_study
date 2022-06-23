package jkd8new.函数式接口;

import org.junit.Test;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class test1 {
    @Test
    public void test2(){
        h1(1.0,new MyInterface(){

            @Override
            public int method1() {
                System.out.println("a1");
                return 1;
            }
        });
    }
    public void h1(double m,MyInterface n){
      n.method1();
    }

    public void h2(){
        System.out.println("hello");
    }

    @Test
    public void t3() {
        Persion p1 = new Persion("1","aa");
        Supplier<String> getId = p1::getId;
        String s = getId.get();
        System.out.println(s);
        Supplier<String> getName = p1::getName;
        String s1 = getName.get();


    }
    @Test
    public void t4() {
        BiFunction<Persion, Persion, String> b1 = (Persion p1, Persion p2) -> p1.getId() + p2.getId();
        String apply = b1.apply(new Persion("1", "a"), new Persion("2", "b"));
        System.out.println(apply);

    }
    @Test
    public void t5() {
       Supplier<Persion>p1 =()->new Persion();

        BiFunction<String,String,Persion> p2 = Persion::new;
        Persion apply = p2.apply("1", "2");
        System.out.println(apply.getId());


    }


    }
