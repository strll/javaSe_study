package jkd8new.函数式接口;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Persion {
    String id;
    String name;

    public Persion() {

    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Persion(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void getId(String s) {
        System.out.println("this ");
    }
}
