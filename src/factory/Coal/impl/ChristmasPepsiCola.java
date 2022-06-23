package factory.Coal.impl;

import factory.Coal.PepsiCola;

/**
 * 生产圣诞版百事可乐方法
 */
public class ChristmasPepsiCola implements PepsiCola {

    @Override
    public void PepsiCola() {
        System.out.println("生产了圣诞版的百事可乐");
    }
}

