package factory.Factory.impl;

import factory.Coal.CocaCola;
import factory.Coal.impl.NewYearCocaCola;
import factory.Coal.impl.NewYearPepsiCola;
import factory.Coal.PepsiCola;
import factory.Factory.ColaFactory;

/**
 * 新年版的加工厂
 * 可以生产新年版的可口可乐和百事可乐
 */
public class NewYearFactory implements ColaFactory {
    @Override
    public CocaCola getCocaCola() {
        return new NewYearCocaCola();
    }

    @Override
    public PepsiCola getPepsi() {
        return new NewYearPepsiCola();
    }
}

