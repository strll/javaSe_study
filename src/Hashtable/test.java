package Hashtable;

import org.junit.Test;

public class test {
    @Test
    public void test(){
        myHashTable myHashTable = new myHashTable(2);
        myHashTable.add(new Emp(1,"tom"));
        myHashTable.add(new Emp(2,"cat"));
        myHashTable.add(new Emp(3,"jack"));
        myHashTable.add(new Emp(3,"jack"));
       myHashTable.toStringAllEmp();
        System.out.println("==========");
        myHashTable.deleteEmpById(2);
        myHashTable.toStringAllEmp();

//        Emp empById = myHashTable.getEmpById(1);
//        String s = empById.toString();
//        System.out.println(s);
    }
}
