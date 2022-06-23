package AbstractFactory;

import org.junit.Test;

public class test {

    public static void main(String[] args){

        //新建一个总监（替你去买汽车）
        CarDirector director = new CarDirector();

        Car car = director.constructCar(new ConcreteBuilder());

        System.out.println(car.getWheel());
        System.out.println(car.getEngine());
        System.out.println(car.getSkeleton());
    }

@Test
    public void test(){
        String s="hello world";
        System.out.format("%1s",s);}

}

