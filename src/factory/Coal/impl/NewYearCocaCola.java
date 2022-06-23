package factory.Coal.impl;

import factory.Coal.CocaCola;

/**
 * 生产新年版的可口可乐
 */
public class NewYearCocaCola implements CocaCola {
    @Override
    public void CocaCola() {
        System.out.println("生产了新年版的可口可乐");
    }
}

