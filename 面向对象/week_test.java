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
}
class Cylineder extends Circle{
	private double h;
	private double r;
	public Cylineder(){

	}
	public Cylineder(double h,double r){
		super.setR(r);
		this.h=h;
		this.r=r;
	}
	public double getVolume( Cylineder c){
		double s=super.getArea(c);
		double volume=0.0;
		volume=s*c.h;
		System.out.println(s);
		return volume;
	}
	public static void showVolume(Cylineder c){
		System.out.println("半径为"+c.r+"高为"+c.h+"的圆柱体的体积为："+c.getVolume(c));
	}
}

class  PrintCircle{
	public static void main(String[] args) {
		Circle c=new Circle(2.5);
		Cylineder cy=new Cylineder(3,5);
		Circle.print(c);
		Cylineder.showVolume(cy);
	}
}


class Vehicles{
	public String brand;
	public String color;
	public Vehicles(){
		brand=null;
		color=null;
	}  
	public Vehicles(String brand,String color){
		this.brand=brand;
		this.color=color;
	}
	public void setBrand(String brand){
		this.brand=brand;
	}
	public  String getBrand(){
		return brand;
	}
	public void setColor(String color){
		this.color=color;
	}
	public  String getColor(){
		return color;
	}
	public void run(){
		System.out.println("我已经开动了");
	}
	public static void showInfo(Vehicles v){
		System.out.println(" 商标："+v.brand+" 颜色:"+v.color);
	}
}

class Car extends Vehicles{
	public int seats;
	public Car(){
		seats=0;
	}
	public Car (int seats){
		this.seats=seats;
	}
	public static void showCar( Car c){
		System.out.println(" 商标："+c.getBrand()+" 颜色:"+c.getColor()+" 座位："+c.seats);
	}
}
class Truck extends Vehicles{
	public float load;
	public Truck(){
		load=0.0f;
	}
	public Truck (float load){
		this.load=load;
	}
	public static void showTruck( Truck t){
		System.out.println(" 商标："+t.getBrand()+" 颜色:"+t.getColor()+" 载重："+t.load);
	}
}
class Vehicle_test{
	public static void main(String[] args) {
		Vehicles v=new Vehicles("奔驰","黑色");
		Vehicles.showInfo(v);
		Car  c=new Car(4);
		c.color="黑色";
		c.brand="宝马";
		Car.showCar(c);
		Truck t=new Truck(45.6f);
		t.color="蓝色";
		t.brand="东风";
		Truck.showTruck(t);
	}
}