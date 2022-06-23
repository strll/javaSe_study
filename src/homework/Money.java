package homework;

import java.util.HashMap;
import java.util.Scanner;

public class Money {
    public static Scanner sc = new Scanner(System.in);
    public static HashMap<String, User> stringUserHashMap = new HashMap<>();

    public static void main(String[] args) {
        while (true){
            System.out.println("选择功能 1添加账户  2删除账户 3存取款 4查询账户信息 5退出系统");
            String name = sc.nextLine();
            if(name.equals("1")){
                insert();
            }
        }
    }
    public static void insert(){
        System.out.println("输入名字");
        String name = sc.nextLine();
        User user = stringUserHashMap.get(name);
        if(user==null){
            System.out.println("输入密码");
            String password = sc.nextLine();
            User user1 = new User();
            user1.setPassword(password);
            user1.setUserName(name);
            stringUserHashMap.put(name,user1);
        }else{
            System.out.println("账户已经存在");
        }
    }
}
