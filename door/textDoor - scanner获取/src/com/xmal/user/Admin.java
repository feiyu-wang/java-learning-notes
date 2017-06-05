package com.xmal.user;
/*Admin(管理员子类)*/
import java.util.Random;
import java.util.Scanner;

import com.xmal.sys.ControlSystem;
import com.xmal.sys.Door;
public class Admin extends Employee {
	private static String employeString="张三1,mima1,正式员工,card1,1;张三2,mima2,正式员工,card2,2;张三3,mima3,非正式员工,card3,3;";
	public static String [] arrString=employeString.split(";");
	public String[] password   = new String[arrString.length]; 
	public String[] cards       = new String[arrString.length];
	public String[] fingerMarks = new String[arrString.length];
	public static int index;//进门的人员索引
	public static int search;//查询员工索引
	public static int count=3;
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
 	//姓名判断
 	public String judgeName(){
 		String newName=null;
 		while (true) {
 		    System.out.println("请输入您的姓名：");
 		    String iName=new Scanner(System.in).next();
 		    if (iName.length()<3) {
				System.out.println("姓名不能少于三个字");
			}else{
				newName=iName;
				break;
			}
		}
		return newName;
 	}
 	//员工类型判断
 	public String judgeType(){
 		String newType=null;
 		while (true) {
 		    System.out.println("请选择您的员工类型：1.正式员工，2.非正式员工");
 		    String iType=new Scanner(System.in).next();
 		    if (iType.equals("1")) {
 		    	newType="正式员工";
				System.out.println("正式员工");
				break;
			}else if (iType.equals("2")) {
				newType="非正式员工";
				break;
			}else{
				System.out.println("选择错误");
			}
		}
		return newType;
 	}
 	//员工密码设置
 	public static String judgePass(){
 		String newPass=null;
 		while (true) {
 		    System.out.println("请输入您的密码：");
 		    String iPass=new Scanner(System.in).next();
 		    if (iPass.length()!=6) {
				System.out.println("密码长度必须是6位");
			}else{
				newPass=iPass;
				break;
			}
		}
		return newPass;
 	}
 	//员工胸卡密码设置
 	public static String judgeCard(){
 	    int iCard=new Random().nextInt(9000) + 1000;
		String newCard=String.valueOf(iCard);
 	    return newCard;
 	}
 	//员工密码设置
 	public static String judgeFinger(){
 		String newFinger=null;
 		while (true) {
 		    System.out.println("请选择录入手指：1左大拇指   2左食指  3左中指  4左无名指 5左小拇指  6右大拇指   7右食指  8右中指  9右无名指 10右小拇指");
 		    int iFinger=new Scanner(System.in).nextInt();
 		    if (iFinger>10||iFinger<1) {
				System.out.println("录入错误,请重新选择");
			}else{
				switch (iFinger) {
				case 1:newFinger="左大拇指"; break;
				case 2:newFinger="左食指"; break;
				case 3:newFinger="左中指"; break;
				case 4:newFinger="左无名指"; break;
				case 5:newFinger="左小拇指"; break;
				case 6:newFinger="右大拇指"; break;
				case 7:newFinger="右食指"; break;
				case 8:newFinger="右中指"; break;
				case 9:newFinger="右无名指"; break;
				case 10:newFinger="右小拇指"; break;
				default:break;
				}
				break;
			}
		}
		return newFinger;
 	}
 	//增加员工信息
 	public void addEmpInfo(){
 		setName(judgeName());
 		setType(judgeType());
 		employee[count]=new Employee(getName(),getType());
 		count++;
 		//String newname=new Scanner(System.in).next();
 		
 	}
 	//查询访客信息
 	public void showInfo(String empName,ControlSystem c){
 		for (int i = 0; i < employee.length; i++) {
			if (employee[i].getName().equals(empName)) {
				search=i;
				System.out.println("姓名："+employee[i].getName()+"员工类型："+employee[i].getType()+"密码:"+c.password[search]+"胸卡密码:"+c.cards[search]+"指纹密码:"+c.fingerMarks[search]);
				break;
			}
		}
 	}
}
