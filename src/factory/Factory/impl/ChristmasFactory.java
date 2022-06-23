package factory.Factory.impl;

import factory.Coal.impl.ChristmasCocaCola;
import factory.Coal.impl.ChristmasPepsiCola;
import factory.Coal.CocaCola;
import factory.Coal.PepsiCola;
import factory.Factory.ColaFactory;

/**
 * 圣诞系列加工厂
 * 生产 圣诞的百事可乐和可口可乐
 */

public class ChristmasFactory implements ColaFactory {


    @Override
    public CocaCola getCocaCola() {
        return new ChristmasCocaCola();
    }

    @Override
    public PepsiCola getPepsi() {
        return new ChristmasPepsiCola();
    }
}

