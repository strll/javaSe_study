package AbstractFactory;

/**
 * 抽象建造者
 */
public interface ICarBuilder {

    public void buildwheel();   //构建车轮
    public void buildSkeleton();   //构建骨架
    public void buildEngine(); //构建发动机

    Car buildCar();

}

