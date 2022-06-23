package java_this;

public class father {
    private String dec;

    public father() {
        this.dec=getDec();
    }

    public  String name1="father";

    public String method(){
        return "fathermethod";
    }

    public String getDec(){
        return "this is father";
    }
    public String toString(){

        return dec;

        }


}
