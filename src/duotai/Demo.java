package duotai;

public class Demo extends animal {
    public static void main(String[] args) {
        Cat cat =new Cat();
        Dog dog=new Dog();
        method(cat);
        method(dog);
        System.out.println("---------");
        animal animal= new Cat();
         animal.eat();
        System.out.println("---------");
        animal animal_dog= new Dog();
        animal_dog.eat();
        System.out.println(animal_dog.string);


    }
    public static void method(Dog a) {
        a.eat();
    }
    public static void method(Cat a) {
        a.eat();
    }
}
