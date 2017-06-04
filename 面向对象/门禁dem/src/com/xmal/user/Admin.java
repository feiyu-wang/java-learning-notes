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

    //管理员的工作方法1，通过控制室的按钮，开启电子门
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

    //管理员的工作方法2，监听门铃
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
 		for (int i = 0; i < employee.length; i++) {
			if(employee[i].getName().equals(namestr)){
				flag=true;
				index=i;
				break;
				
			}
		}
 		return flag;
 	}
 /*  public void addCards() {
        for(int i=0;i<Admin.arrString.length;i++){
            this.cards[i]=Admin.arrString[i].split(",")[3];
        }
    }


    public void addfingerMarks() {
        for(int i=0;i<100;i++){
        	 this.fingerMarks[i]=Admin.arrString[i].split(",")[4];
        }
    }
    public void addpassword() {
        for(int i=0;i<100;i++){
        	 this.password[i]=Admin.arrString[i].split(",")[1];
        }
    }*/
   /* public void addUserInfo( String valType, String valStr) {
        if (valType.equals("pa")) {
            controlSys.getComputer().addPassWord(Integer.parseInt(valStr));
            controlSys.getLogger().debug(
                    "管理员(" + this.getName() + ")录入新的密码验证信息");
       } else if (valType.equals("ca")) {
            controlSys.getComputer().addCard(valStr);
            controlSys.getLogger().debug(
                   "管理员(" + this.getName() + ")录入新的胸卡验证信息");
        } else if (valType.equals("fi")) {
            controlSys.getComputer().addFingerMark(valStr);
            controlSys.getLogger().debug(
                    "管理员(" + this.getName() + ")录入新的指纹验证信息");
        } else {
            controlSys.getLogger().debug("验证信息录入失败");
        }
    }*/
}
