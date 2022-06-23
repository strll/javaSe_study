

public class student {
    private  String name;
    private static String st;
    public static String getSt() {
        return st;
    }
    public static void setSt(String st) {
        student.st = st;
    }
    public  String getName() {
        return name;
    }
    public  String setName(String name) {
        this.name = name;
        return name;
    }
    private  int age;
    public  int getAge() {
        return age;
    }
    public  int setAge(int age) {
        if (age>0) {
            age = age;
            return age;
        }
        else{
            System.out.println("您输入的年龄有误");
            return -1;
        }


    }
    public static void main(String[] args) {
        getSt();


        student student = new student();
        student student1 = new student();
        student student2 = new student();
        student student3 = new student();
        String s = student.setName("円香");
        student.setSt("这是円香");
        String st = student.getSt();
        String st1 = student1.getSt();
        System.out.println("st:"+st+"st1"+st1);
        int i = student.setAge(18);
        System.out.println(s+"--"+i);


    }
}