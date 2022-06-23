package AbstractFactory;

/**
 * 产品类
 */
public class Car {

    //车的建造过程

    private String wheel;  //车轮
    private String skeleton;  //车架
    private String engine;   //发动机


    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getSkeleton() {
        return skeleton;
    }

    public void setSkeleton(String skeleton) {
        this.skeleton = skeleton;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}


