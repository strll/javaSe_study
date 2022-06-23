package factory.Factory;

import factory.Coal.CocaCola;
import factory.Coal.PepsiCola;

/**
 * 可乐工厂（抽象工厂）
 * 可以生产两种版本的可乐
 */

public interface ColaFactory {

    //生产可口可乐：两个版本
    public CocaCola getCocaCola();

    //生产百事可乐：两个版本
    public PepsiCola getPepsi();
}

