package my_Arraylist;

import org.junit.Test;

public class test {
    @Test
    public void test() {
        This_is_my_Linklist<String> my_arraylist = new This_is_my_Linklist<>("1");
        my_arraylist.add("2");
        my_arraylist.add("3");
        my_arraylist.add("4");
        my_arraylist.add("5");
        my_arraylist.add("6");
        my_arraylist.show();
        System.out.println("-----------");
        String pop = my_arraylist.pop();
        my_arraylist.pop();
         my_arraylist.pop();
        //System.out.println(pop);
        System.out.println("----------");
        my_arraylist.show();
    }
    @Test
    public void test2(){
        This_is_my_Linklist<String> stringThis_is_my_linklist = new This_is_my_Linklist<>();
        stringThis_is_my_linklist.head_insert("first");
        stringThis_is_my_linklist.show();
    }
    @Test
    public void test_delect_by_num(){
        This_is_my_Linklist<String> my_arraylist = new This_is_my_Linklist<>("1");
        my_arraylist.add("2");
        my_arraylist.add("3");
        my_arraylist.add("4");
        my_arraylist.add("5");
        my_arraylist.add("6");
        my_arraylist.show();
        my_arraylist.delete_by_num(4);
        System.out.println("-----------");
        my_arraylist.show();


    }




    @Test
    public void test_insert_by_num(){
        This_is_my_Linklist<String> my_arraylist = new This_is_my_Linklist<>("1");
        my_arraylist.add("2");
        my_arraylist.add("3");
        my_arraylist.add("4");
        my_arraylist.add("5");
        my_arraylist.add("6");
        my_arraylist.show();
      //  my_arraylist.insert_by_num(1,"num是1");
        my_arraylist.insert_by_num(4,"num是4");
        System.out.println("-----------");
        my_arraylist.show();
        int size_by_data = my_arraylist.get_size_by_data("num是4");
        System.out.println("==============");
        System.out.println(size_by_data);


    }

}
