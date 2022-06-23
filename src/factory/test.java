package factory;

import factory.Coal.CocaCola;
import factory.Coal.PepsiCola;
import factory.Factory.ColaFactory;
import factory.Factory.impl.ChristmasFactory;
import factory.Factory.impl.NewYearFactory;
import org.junit.Test;

public class test {
    @Test
    public void test(){
        //生产圣诞版可口可乐：
        ColaFactory factory =  new ChristmasFactory();
        CocaCola cola = factory.getCocaCola();
        cola.CocaCola();

        //生产圣诞版百事可乐：
        ColaFactory factory1 = new ChristmasFactory();
        PepsiCola pepsiCola = factory1.getPepsi();
        pepsiCola.PepsiCola();


        //生产新年版的可口可乐：
        ColaFactory factory2 = new NewYearFactory();
        CocaCola cola1 = factory2.getCocaCola();
        cola1.CocaCola();

        //生产新年版的百事可乐：
        ColaFactory factory3 = new NewYearFactory();
        PepsiCola pepsiCola1 = factory3.getPepsi();
        pepsiCola1.PepsiCola();
    }
}
