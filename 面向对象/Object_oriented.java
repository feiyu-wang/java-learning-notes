/*类：具有共同的静态特征（属性）和动态特征（方法）的抽象出来的一类
事物，面向对象的基本组成单位。

类的定义：
 class关键字 类名[]---------------可以省略，不是必须的
 类的完整定义：[访问修饰符] class[泛型] 类名  [extends父类名] [implements 接口名]
 ｛
 	//类体：类中定义具体的静态的特征和动态特征
 	静态特征：成员变量
 	动态特征：成员方法
 ｝


 类的特点：

 类不能直接参与程序的执行（切记）
 类的组成：只有成员变量和成员方法（切记）
 定义成员变量和成员方法
 成员变量==全局变量
 成员方法==一般方法

 类的定义：
 [访问修饰符]--------public .static,final,abstract 
 public 公共的  static 静态的  final 最终的 abstract 抽象的

 成员变量

 类本身固有的静态的特征

  完整定义：[访问修饰符]变量的数据类型 变量名
  [访问修饰符]-------public ,private,protected,static ,final,synchronized ,transient
  public ,private ,protected------------变量到哪能用
  static ------------静态变量
  final--------------最终变量
  synchronized -------------------多个进程中使用的变量
  transient ----------------------瞬态

  成员方法

  类在变化过程中不断改变董涛的特征

  完整的定义：[访问修饰符] [static] [返回值类型] [泛型] 方法名([形参]) [throws语句]
    {
    	方法体
    }

    [访问修饰符]------------public private protected static final abstract native

    native不是纯Java语言定义的方法
ps:类不参与程序的执行

对象的产生
类中直接参与程序运行的实力对象

栈中产生的对象的具体地址--堆中的首地址指向(对象的所有的数据)
产生：通过new关键字
语法格式：类名 对象名 =new 类名() ;//栈中开辟内存空间

	Person p1 =new  Person();

对象的使用

成员变量的使用：对象名.成员变量
p1.age======p1的年龄
成员方法的使用:对象名.成员方法
p1.walk()-============p1这个人会走

使用注意事项：
1成员变量在使用的过程中没有赋初值，计算机会默认按照数据类型赋相应的初值
2成员变量和成员方法的使用前提，必须先生成实例对象
3通过方法来对成员变量进行赋值和取值的操作
4成员变量的非法值得判断---控制使用输入的成员变量的值*/


import java.util.*;

/*class Demo{
	public static void main(String[] args) {
		Person p1=new Person();
		p1.name="张三";
		p1.run(20);
    p1.setAge(16);
    p1.getAge();
    Person p2=new Person();
    System.out.println("您的年龄是："+p1.age);
    p1.age=80;
     p1.setAge(16);
    p1.getAge();
    System.out.println("您的年龄是："+p2.age);

     p2.name="李四";
    //p2.run();
    //p2.setAge(-16);
    p2.getAge();
	}
}

//类
class Person{
	//定义静态的成员变量或属性
	public String name;
	public int age;
	public boolean sex;

	public void  run(int speed) {
		System.out.println(name+"跑步速度是:"+speed+"m/s");
	}
  public int setAge(int myage){
    if (age>200||age<0) {
      System.out.println("您的年龄设置有误");
      return age=0;
    }else{
       System.out.println("您的年龄正确啊");
       return  age=myage;
    }
  }
  public void getAge(){
    if (age<0||age>200) {
       System.out.println("您的年龄有问题啊");
    }else{
      System.out.println("getAge:"+age);
    }
  }
}*/
class Caculate{
   public int max;
   public int min;
   public int average;
   public int  getAverage(int arr []){
      int i=0;
      int sum=0;
      while (i<=arr.length-1) {
         sum+=arr[i];
         i++;
      }
      int num=sum/arr.length;
      return average=num;
   }
   public int getMin(int arr []){
        Arrays.sort(arr);
        return min=arr[0];
   }
   public int getMax(int arr []){
    int getlength=arr.length;
         Arrays.sort(arr);
        return max=arr[getlength-1];
   }
}
class Demo{
  static Scanner input=new Scanner(System.in);
  public static void main(String[] args) {
    int [] arr=new int[10];
    for(int i = 0; i<arr.length;i++){
      arr[i]=input.nextInt();
    }
   Caculate getDefult=new Caculate();
    //最大值
    getDefult.getMax(arr);
    System.out.println("max:"+getDefult.max);
     //最大值
    getDefult.getMin(arr);
    System.out.println("min:"+getDefult.min);
     //平均值
    getDefult.getAverage(arr);
    System.out.println("平均值:"+getDefult.average);
  }
}