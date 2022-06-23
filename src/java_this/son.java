package java_this;

public class son extends father{
    private String name;
    private double weight;
  public String name1="son name1";
    public son(String name,double weight){
        this.name=name;
        this.weight=weight;
    }

    public son() {
    }

    @Override
    public String getDec(){
        return "the son name="+name+" weight="+weight;
    }

    public static void main(String[] args) {
        System.out.println(new son("wxt",80));
        son wxt = new son("wxt", 80);
        String dec = wxt.getDec();
        System.out.println(dec);
    }
}
