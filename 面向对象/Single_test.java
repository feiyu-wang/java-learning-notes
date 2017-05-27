/*1 定义一个圆类，定义圆的半径（私有，浮点），定义构造方法（全参和无参），
定义半径变量的get和set方法，定义一个求圆的面积的方法，圆的周长的方法，打印结果的方法*/
import  java.util.*;
import  java.math.*;
class Circle{
	private double r;
	public Circle(){ 
		r=0;
	}
	public Circle (double r){
		this.r=r;
	} 
	public void setR(double r){
		if (r<=0) {
			System.out.println("半径定义有误");
		}else{
			this.r=r;
		}
	}
	public double getR(){
		return  r;
	}
	//Math.pow(b,2)---Math.PI
	public double getArea(Circle c){
		double area=0.0;
		area=Math.PI*Math.pow(c.getR(),2);
		BigDecimal b=new BigDecimal(area);
		double d=b.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
		return d;
	}
	public double getPerimeter(Circle c){
		double perimeter=0.0;
		perimeter=2*Math.PI*c.getR();
		BigDecimal b=new BigDecimal(perimeter);
		double d=b.setScale(2,RoundingMode.HALF_UP).doubleValue();
		return d;
	}
	public static  void print(Circle c){
		System.out.println("半径为"+c.getR()+"的圆的面积为："+c.getArea(c));
		System.out.println("半径为"+c.getR()+"的圆的周长为："+c.getPerimeter(c));
	}
	public static void main(String[] args) {
		Circle c=new Circle(2.5);
		Circle.print(c);
	}
}
/*2 定义一个表示学生信息的类Student，要求如下：  
（1）类Student的成员变量：  sNO 表示学号；sName表示姓名；sSex表示性别；sAge表示年龄；
	sJava：表示Java课程成绩。   
（2）类Student带参数的构造方法：   在构造方法中通过形参完成对成员变量的赋值操作。 
（3）类Student的方法成员： getNo（）：获得学号；  getName（）：获得姓名；  getSex（）：
	 获得性别； getAge（）获得年龄；  getJava（）：获得Java 课程成绩  
（4）根据类Student的定义，创建五个该类的对象，输出每个学生的信息，
	 计算并输出这五个学生Java语言成绩的平均值，以及计算并输出他们Java语言成绩的最大值和最小值。
*/
class Student{
	private String sNo;
	private String sName;
	private boolean sSex;
	private int sAge;
	private double sJava;
	public Student(){
		this.sNo=null;
		this.sName=null;
		this.sSex=false;
		this.sAge=0;
		this.sJava=0;
	}
	public Student(String sNo,String sName,boolean sSex,int sAge,double sJava){
		this.sNo=sNo;
		this.sName=sName;
		this.sSex=sSex;
		this.sAge=sAge;
		this.sJava=sJava;
	}

	public String getNo(){
		return sNo;
	}
	public String getName(){
		return sName;
	}
	public boolean getSex(){
		return sSex;
	}
	public int getAge(){
		return sAge;
	}
	public double getJava(){
		return sJava;
	}
	public static void printInfor(Student s){
		System.out.println(" 学号："+s.getNo()+" 姓名："+s.getName()+" 性别："+(s.getSex()==true?"男":"女")+" 年龄："+s.getAge()+" Java成绩："+s.getJava());
	}
	public static void printJava(Student [] s){
		double [] arr=new double[5];
		double sum=0.0;
		for (int i=0;i<arr.length ;i++ ) {
			arr[i]=s[i].getJava();
			sum+=s[i].getJava();
		}
		double average=sum/5;
		Arrays.sort(arr);
		System.out.println("Java成绩最高为："+arr[arr.length-1]+"\n"+"Java成绩最低为："+arr[0]+"\n"+"Java平均成绩："+average);
	}
	public static void main(String[] args) {
		Student [] s=new Student[5];
		 s[0]=new Student("012","菲雨",true,25,90);
		 s[1]=new Student("013","王城",true,51,98);
		 s[2]=new Student("014","小乔",false,20,88);
		 s[3]=new Student("015","刘备",true,23,86);
		 s[4]=new Student("016","墨子",true,19,97);
		//打印学生信息
		Student.printInfor(s[0]);
		Student.printInfor(s[1]);
		Student.printInfor(s[2]);
		Student.printInfor(s[3]);
		Student.printInfor(s[4]);
		//输出最高分和最低分
		Student.printJava(s);
	}
}