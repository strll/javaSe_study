package TimeAndSpace;

public class demo1 {
    public static void main(String[] args) {


  //  fn(2);


  //      digui(5);

        int fact = fact(3);
        System.out.println(fact);

    }

    public static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }


    public static void fn(int i){
        for(int j=0;j<i;j++){
            System.out.println("这是第"+j+"次输出");
            for(int k=0;k<i;k++){
                System.out.println("这是第"+k+"次输出");
            }

        }
    }

    public static int digui(int n){
        int a,b,c;

        int[][] ac=new int[n][n];

        if(n>1){
            digui(n-1);
        }
        System.out.println("hellowrld"+n);
        return n;
    }

}
