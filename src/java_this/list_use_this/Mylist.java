package java_this.list_use_this;

public class Mylist {
    private Mylist now;
    private Mylist before;
    private Mylist end;
    private String  data;

    public Mylist() {
        this.now = this;
        this.before = null;
        this.end = null;
        this.data = null;
    }
    public void add(String str){
        Mylist new_list = new Mylist();
        new_list.data=str;
        new_list.before=this.now;
        this.now=new_list;
        this.end=new_list;
    }
    public String pop(){
       String re= this.now.data;
       this.now=this.now.before;
        return re;
    }
}
