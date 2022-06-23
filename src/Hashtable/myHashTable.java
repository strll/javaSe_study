package Hashtable;

public class myHashTable {
    private EmpLinkedList[] empLinkedLists;
    private int size ;
    public myHashTable(int size) {
        this.size = size;
        this.empLinkedLists=new EmpLinkedList[size];
        for (int i=0;i<size;i++){
            empLinkedLists[i]=new EmpLinkedList();
        }
    }
    public void add(Emp emp){
        int hash = gethash(emp.getId());


        empLinkedLists[hash].add(emp);
    }

    public void toStringAllEmp(){
        for(int i=0;i<size;i++){
             empLinkedLists[i].toStringEmp();
        }
    }

    public void deleteEmpById(int id){
        int hash = gethash(id);
       empLinkedLists[hash].deleteEmpById(id);
    }

    public Emp getEmpById(int id){
        int hash = gethash(id);
        Emp empById = empLinkedLists[hash].getEmpById(id);
        return empById;

    }

    public int gethash(int i){
        return i%size;
    }

}
