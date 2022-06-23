package java_this;

import org.junit.jupiter.api.Test;

public class test {
    @Test
    public void test(){
        father father= new son();
        String method = father.method();
        System.out.println(method);
        System.out.println(father.name1);
    }
}
