/*构造方法的特点：

1.名字跟类名相同
2.生成实例对象时自动调用
3.没有返回值

构造方法的作用：
1.可以用来初始化成员变量。

与一般方法的区别：
1.普通方法有返回值，构造方法无返回值；
2.每个实体类都至少有一个构造方法；
3.构造方法生成实例对象时自动调用，普通方法先生成实例对象，用实例对象去调用

this关键字的用法：
1.在成员变量前面加this,表示当前对象；

2.同一个类中的构造方法相互调用.使用时必须放在构造器的第一句；*/

/*自定义封装一个复数类，成员变量定义一个实部，定义一个虚部
，把这个类封装，并且全参和空参的构造方法定义，实现两个复数对象的相加求和，差，相减，相乘，相除。*/

/*class Complex{
	private int realNum;
	private int noNum;

	public Complex (){
	}
	public Complex(int realNum,int noNum){
		this.realNum=realNum;
		this.noNum=noNum;
	}

	public void setRealNum(int realNum){
		this.realNum=realNum;
	}
	public int getRealNum(){
		return realNum;
	}
	public void setNoNum(int noNum){
		this.noNum=noNum;
	}
	public int getNoNum(){
		return noNum;
	}

	public String toString(){
		return this.realNum+"+"+this.noNum+"*i";
	}
	public void numAdd(Complex b,Complex a){
		this.realNum=a.realNum+b.realNum;
		this.noNum=a.noNum+b.noNum;
		//System.out.println(a.realNum+b.realNum+"+"+(a.noNum+b.noNum)+"*i");
	}
	public void numReduce(Complex a,Complex b){
		//System.out.println(a.realNum-b.realNum+"+"+(a.noNum-b.noNum)+"*i");
	}
/*a.re a.no b.re b.no*/
/*	a=3 bi=2 c=5 di=4*/
/*乘法法则：		15-8	
（a+bi）·（c+di）=（ac－bd）+（bc+ad）i
除法法则：			15+8	  25  16       10-12    25+16
						23	/41			     -2   /    41
（a+bi）/（c+di）=[（ac+bd）/（c²+d²）]+[（bc-ad）/（c²+d²）]i.  

	public void numRide(Complex a,Complex b){
		System.out.println(a.realNum*b.realNum-a.noNum*b.noNum+"+"+(b.realNum*a.noNum+a.realNum*b.noNum)+"*i");
	}
	public void numExcept(Complex a,Complex b){
		double c=(double)(a.realNum*b.realNum+a.noNum*b.noNum)/(double)(b.realNum*b.realNum+b.noNum*b.noNum);
		double d=(double)(b.realNum*a.noNum-a.realNum*b.noNum)/(double)(b.realNum*b.realNum+b.noNum*b.noNum);
		System.out.println(c+"+"+d+"*i");
	}
	//public int noNumAdd()
	public  int changeReal(int realNum){
		return	realNum=100;
	}
	public  int changeComplex(Complex c){
		return	c.realNum=100;
	}
	public  void changestr(String real){
		real="hello world";
	}
}
class Demo{
	public static void main(String[] args) {
		Complex c1=new Complex();
		c1.setRealNum(3);
		c1.setNoNum(2);
		Complex c2=new Complex(5,4);
		Complex c=new Complex ();	
		c.numAdd(c1,c2);
		System.out.println(c);
		/*c1.numAdd(c1,c2);
		c1.numReduce(c1,c2);	
		c1.numRide(c1,c2);
		c1.numExcept(c1,c2);
		//System.out.println();
		int realNum=c1.getRealNum();
		System.out.println("未调用方法前的实不的值："+realNum);
		c1.changeReal(realNum);
		System.out.println("调用changeReal()方法之后的实不的值"+realNum);

		c1.changeComplex(c1);
		realNum=c1.getRealNum();
		System.out.println("调用changeComplex()方法之后的实不的值"+realNum);
		String str="123";
		c1.changestr(str);
		System.out.println("changestr()方法之后的实不的值"+str);
	}
}*/


/*函数的参数传递

基础类型数据--------值得传递

	传递变量的值，不会改变本身在内存中数据

对象类型数据----引用地址的传递

	穿的的是对象的首地址，将首地址指向的引用内容的数码局改变后，对象的数据也肯定改变*/

/*static (静态)关键字

static关键字：

	静态修饰符
	用处：1.修饰类------静态类(内部类的时候讲解)；
		  2.修饰变量------类成员变量
		  3.修饰方法----------类成员方法
		  4.修饰代码块---------静态代码块

类成员变量
	static关键字修饰的成员变量叫做类成员变量。
	static关键字修饰的成员变量不再属于单个的实例对象，而是属于类中的所以对象的共有的属性
	static关键字修饰的成员变量可以直接用类名，成员变量调用，不用生成类的实例对象。

类成员方法
	static关键字修饰的成员方法是属于整个类的实例对象的共有的方法
	类成员方法可以使用类名.成员方法来调用，多了一种个成员方法访问的方式
	非静态的成员方法可以访问任何类型的成员变量
	静态的成员方法只能访问静态的成员变量
	静态的成员方法之间相互之间可以调用，不能调用非晶体的成员方法
	非静态的成员方法可以调用静态的成员方法，也可以调用非静态的成员方法
	static关键字要放在返回值类型的前面*/




/*
1.用处：在内存中读取固定存在的资源
	非静态代码块
	{
	   //独立代码块-----------------独立的内存空间
	}
	static
	{
	   //静态代码块----------------独立的内存空间
	}


静态代码块-特点2
    2静态代码块与实例对象生成的先后顺序
    ----先于实例对象的生成
    执行顺利：
    	1静态代码块
    	2非静态代码块(随着类的实例对象的生成同时被调用);
    	3.构造方法;
  静态代码块-特点3
  	3静态代码块于main()方法执行的先后顺序
  	-----先于main()方法的执行
  	执行顺序：
  	1静态代码块
  	2main()方法
  	3非静态代码块
*/
import  java.util.*;

class Car{
	private String name;
	private String color;
	private int   price;
	private int  seats;
	public  int count2;
	public static int count;//static修饰的成员变量不属于单个实例对象，是类中的所有对象共有的属性，叫做类成员变量

	public Car(){
		count2++;
		this.name=null;
		this.color=null;
		this.price=0;
		this.seats=0;
	}

	public Car(String name,String color,int price,int seats){
		count++;
		count2++;
		this.name=name;
		this.color=color;
		this.price=price;
		this.seats=seats;
	}
	public int getPrice(){
		return price;
	}
	public   int getMaxprice(Car[] c){
		int [] arr= new int[c.length];
		for (int i=0;i<c.length;i++ ) {
			arr[i]=c[i].getPrice();
		}
		Arrays.sort(arr);
		getPrice();
		System.out.println(Arrays.toString(arr));
		return arr[c.length-1];
	}
}
class Demo{
	public static void main(String[] args) {
		Car [] c=new Car [4];
		c[0]=new Car("宝马","黑色",40,4);
		c[1]=new Car("奔驰","灰色",30,4);
		c[2]=new Car("奥迪","白色",20,4);
		c[3]=new Car("凌志","黑色",60,4);

	/*	Car  cc1=new Car();
		//int [] arr={40,40,50,60};
		System.out.println(Car.count);//4

		System.out.println(c4.count2);//1

		System.out.println(c4.count);//4*/
		//System.out.println(c1.getMaxprice(arr));
		//System.out.println(Car.getMaxprice(c));
	}
}


class Demo2{
	private int age;
	private static int count;

	static
	{	
		count++;
		System.out.println("静代码块-----1---"+count);
	}

	{
		System.out.println("非静态代码块-------1"+count);
	}
	{
		System.out.println("非静态代码块----````---1"+count);
	}
	{
		System.out.println("非静态代码块---``````----1"+count);
	}
	public Demo2(){
		System.out.println("空参构造函数");
		{
			System.out.println("非静态代码块-------3"+count);
		}
	}
	public static void  fun(){
		{
			count++;
			System.out.println("非静态代码块-------2---"+count);
		}
	}

	public static void main(String[] args) {
		new Demo2();
		new Demo2().fun();
	}
}

class Dog{
	private String name;
	private String type;
	private int age;
	private static double height;
	private static int bone;
	static{
		bone++;
		height+=0.1;
		System.out.println(bone+"------------"+height);
	}
	public Dog(){
		name=null;
		type=null;
		age=0;
		height=0.0;

	}
	public Dog(String name,String type,int age, double height) {
		bone++;
		this.name=name;
		this.type=type;
		this.age=age;
		this.height=height;
	}
	public void setAge(int age){
		if (age>35||age<0) {
			System.out.println("输入年龄不合法");
		}else{
			this.age=age;
		}
	}
	public double getAge(){
			return age;
	}
	public static void changeBone(){
		{
			bone=0;
			System.out.println("我改变了骨头的数量"+bone);
		}
	}
	/*public double [] getHeightArr(Dog [] d){
		double [] arr=new double[d.length-1];
		for (int i=0;i<d.length-1; ) {
			arr[i]=d[i].getHeight();
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}*/
	public void setType(String type){		
			this.type=type;
	}
	public String getType(){
			return type;
	}
	public static void smell(Dog d){
		System.out.println(d.getType()+"嗅觉都非常敏锐");
	}
	public static void main(String[] args) {
		Dog d1=new Dog("小黑","斑点狗",20,0.4);
		Dog d2=new Dog("小黄","大黄狗",21,0.56);
		Dog d3=new Dog("小白","长毛狗",18,0.6);
		System.out.println(Dog.bone);
		d3.smell(d3);
		Dog.changeBone();
	}
}


class TestInteget{
	public static void main(String[] args) {
		int num=521344;
		int num2=Integer.reverse(num);
		System.out.println(num2);
	}
}