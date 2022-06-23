package AbstractFactory;

/**
 * 指导者
 */

//汽车总监
public class CarDirector {

    public Car constructCar(ICarBuilder builder){
        builder.buildwheel();
        builder.buildSkeleton();
        builder.buildEngine();

        return builder.buildCar();
    }
}

