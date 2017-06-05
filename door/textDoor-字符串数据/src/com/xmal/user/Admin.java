package com.xmal.user;
/*Admin(管理员子类)*/
import java.util.Scanner;

import com.xmal.sys.Door;
public class Admin extends Employee {
	public static String employeString="张三1,mima1,正式员工,card1,finger1;张三2,mima2,正式员工,card2,finger2;张三3,mima3,非正式员工,card3,finger3;";
	public static String [] arrString=employeString.split(";");
	public String[] password   = new String[arrString.length]; 
	public String[] cards       = new String[arrString.length];
	public String[] fingerMarks = new String[arrString.length];
	public static int index;
    //构造方法
    public Admin() {
        super();
        addEmployee();
    }
    public Admin(String name) {
        super(name);
    }

    //开启电子门
    public boolean work(Door door) {
        boolean bn = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("管理员(" + this.getName() + ")是否开门:yes/no");
        String btn = scanner.next();
        if (btn.equals("yes")) {
            System.out.println("管理员(" + this.getName() + ")按下开门按钮");
            bn = true;
        } else {
            System.out.println("---管理员(" + this.getName() + ")拒绝开门");
        }
        return bn;
    }

    //监听门铃
    public  boolean work(Door door, Guest guest) {
        boolean bn = false;
        if (door.getRing() ) {    //门铃响
            bn = this.work(door);
            door.setRing(false);
        }
        return bn;
    }

    public void addEmployee(){
		for (int i = 0; i < arrString.length; i++) {
			employee[i]=new Employee(arrString[i].split(",")[0],arrString[i].split(",")[2]);
		}
    }
 
 	public boolean checkEmployee(String namestr){
 		boolean flag=false;
 		
 		for (int i = 0; i < arrString.length; i++) {
 			//System.out.println(employee.length);
 			System.out.println(employee[i].getName());
			if(employee[i].getName().equals(namestr)){
				flag=true;
				index=i;
				break;
				
			}
		}
 		return flag;
 	}
 	public void showInfo(){
 		
 	}
}
