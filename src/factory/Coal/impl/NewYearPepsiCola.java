package factory.Coal.impl;

import factory.Coal.PepsiCola;

/**
 * 生产新年版百事可乐的方法
 */
public class NewYearPepsiCola implements PepsiCola {

    @Override
    public void PepsiCola() {
        System.out.println("生产了新年版的百事可乐");
    }
}

