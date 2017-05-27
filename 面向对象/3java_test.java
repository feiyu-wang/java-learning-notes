//父类 人
class Person extends Object{
	public int age;
	public String name;
	private  String looks;
	public Person(){
		System.out.println("我的空参构造方法==========Person");
	}
	public Person (int age , String name,String looks) {
		this.age=age;
		this.name=name;
		this.looks=looks;
		System.out.println("我的全参构造方法=============Person");
	}
	public String getLooks(){
		return looks;
	}

	public void print(){
		System.out.println("我要打印Person传入的年龄"+this.age);
		System.out.println("我要打印Person传入的姓名"+this.name);
	}
	public  void myPrint(Person p){
		System.out.println("我们有一样的方法");
		System.out.println("我这个是静态的打印年龄方法"+p.age);
		System.out.println("我这个是静态的打印姓名方法"+p.name);
		//System.out.println("我这个是静态的打印姓名方法"+getLooks());
	}
}

//Person的子类
class Student extends Person{
	public String grade;//学生共有的班级
	public String  id;  //学号
	public  void finalize() {
		System.out.println("正在消失实例对象");
	}
	public Student (){
		super(21,"啊的","ww");
		System.out.println("我是子类空参构造方法===========Student");
	}
	public Student (String grade,String id){
		super(21,"啊的","ww");
		this.grade=grade;
		this.id=id;
		System.out.println("我是子类全参构造方法===========Student");
	}
	public  void myPrint(Student s){
		//super.myPrint(new Person(21,"啊的","帅"));
		System.out.println("我们的方法不一样");
		System.out.println("子类");
		System.out.println("我这个是自己静态的打印年龄方法"+this.age);
		System.out.println("我这个是自己静态的打印姓名方法"+this.name);
	}
}
//Student的子类
class Graduate extends Student{
	private String direction; //研究生私有的学习方向
	public Graduate (){
		super();
	}
}
//Student的子类
class Undergraduate extends Student{
	private String examination;//本科生私有的成员变量考试
}

class Demo{
	public static void main(String[] args) {
		//Student s=new Student();
		//1.new出来一个构造方法的时候 直接运行
		//结果：我的空参构造方法====Person 
		//我是子类空参构造方法===========Student 说明子类空参构造方法会自动调用父类空参构造方法
		//Person p=new Person(21,"啊的","帅");
		//2.我们来试试全参的吧
		//Student s2=new Student("三年级二班","012");
		//System.out.println(s2.grade);
		//System.out.println(s2.age);
		//结果：我的空参构造方法====Person 
		//我是子类全参参构造方法===========Student 说明子类全参调用构造方法的时候也会自动调用父类空参的构造方法
		//3.我们本来是想调用父类的有参的,试试别的方法
		//Student s2=new Student(21,"旺地");//失败
		//我看到有个super，我们把super关键字拿来试试 放在我的全参构造方法里面 看看能不能拿到父类的全参构造方法

		//放了一个 super(21,"啊的")把参数传进去，我们终于进到父类的全参构造方法里面了。

		/*这下我们试试去取一些数据*/
		//System.out.println(s2.age+"====="+s2.name);//21轻松拿到 super传入的父类的成员变量参数 
		//System.out.println(s2.grade);//自己的参数也轻易拿到了。 


		//试试 父类的私有变量看看，我想应该拿不到、、
		//System.out.println(s2.age+"====="+s2.name+"====="+s2.looks); 果然报错了。


		//试试方法吧，感觉道理应该一样
		 //s2.print(); //一点问题都没有
		//试试静态方法吧
		//s2.myPrint(s2); //
		//Graduate g=new Graduate();
		//System.out.println(g.age+"====="+g.name);//super 很好用 

		//子类和父类方法相同时怎么办
		Student s3=new Student();
		Student s4=new Student();
		s3.myPrint(s3);
		System.gc();

	}
}


/*垃圾回收器*/

class Demo3 extends Object{
	public  void finalize() {
		System.out.println("正在消失实例对象");
	}
	public Demo3(){
		System.out.println("正在生成实例对象");
	}
	public static void main(String[] args) {
		Demo3 c=new Demo3();
		Demo3 c1=new Demo3();
		Demo3 c2=new Demo3();
		Demo3 c3=new Demo3();
		System.gc();
	}
}