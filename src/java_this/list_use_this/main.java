package java_this.list_use_this;

public class main {
    public static void main(String[] args) {
        Mylist mylist = new Mylist();
        mylist.add("1");
        mylist.add("2");
        mylist.add("3");
        String pop = mylist.pop();
        String pop1 = mylist.pop();
        String pop2 = mylist.pop();
        System.out.println(pop);
        System.out.println(pop1);
        System.out.println(pop2);
    }
}
