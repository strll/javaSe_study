package duotai;

public class demo1 {
    interface animal {
        public String name = "。。。";

        public void shout();

        public void info();
    }

    abstract static class action {
        public abstract void eat();
    }

    static class cat extends action implements animal {
        public void eat() {
            System.out.println("爱吃鱼");
        }

        public void shout() {
            System.out.println("喵喵喵");
        }

        public void info() {
            System.out.println("名字：" + name);
        }
    }


    static class example {
        public static void main(String[] args) {
            cat c = new cat();
            c.eat();
            c.info();
            c.shout();
        }
    }
}