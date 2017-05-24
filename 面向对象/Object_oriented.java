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
import  java.math.*;

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
/*class Caculate{
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
对象的声生命周期

对象产生后在什么内存中被认为是垃圾处理掉----对象的消亡

对象从产生----消亡（生命周期）
什么时候对象在内存中被认为是垃圾？
生成一个实例对象，没有调用成员变量和成员方法
实例对象的引用指向为null；
实例对象赋值指向为null；



匿名对象

创建实例对象不指定对象名，直接在内存中进行实例对象的初始化和使用
使用成员变量和成员方法的时候，只能创建一个对象的时候
将对象作为参数来传递的时候，一般使用匿名对象

面向对象三大特征

封装
    自定义模块内部的数据要封装起来，外部不能直接访问内部的数据，公共的方法去访问内部的数据。

继承
    具有共同特征的类之间存在的关系，向上抽取顶层父类，类与类之间形成的饱饭的关系。

多态
  
    由于类之间的继承关系，共有的方法在执行过程中会出现不同的状态


private(私有)关键字

  private关键字：
  是一个权限修饰符。
  用于修饰成员（成员变量和成员函数）
  被私有化的成员只在本类中使用。
用法：

  将成员变量私有化，对外提供对应的set，get方法对其进行访问。

完整封装类-1

1.私有化成员变量。
2每一个成员变量的取值和赋值采用get()和set()来进行、
3.定义的数据是整个类中的对象共有的特征
  尽量使用static关键字，this关键字。

完整类的封装-2
4最鼎城父类-------object类
  1 equals()方法----------比较两个对象的内容是否相等。
  2.hashCode()方法---------哈希码 计算机存贮对象的随机的散列值--------通过对象的所有或者某个成员变量参数
  3 tostring（）方法------------将类实例对象以特定的字符串来显示（自动）

构造方法定义

[修饰符]类名([形参列表]){
  //成员变量的初始化赋值
}
[修饰符]---------public
特点：1构造方法名字必须是类名
      2构造方法没有返回值类型
      3生成实例对象，默认会调用空参构造方法

构造方法与一把方法的比较
      使用时间：
      一般方法：先生成实例对象，再通过实例对象调用饭方法。
      构造方法：生成实例对象的同时，自动调用构造方法
      使用地方：
      一般方法：定义类中任何地方，一般方法的方法名随便定义
      构造方法：定义在实体类，方法名必须是类名
      返回值
      一般方法：
      必须有返回值
      构造方法：不要定义返回值


this 关键字
表示当前对象

this关键字调用构造方法必须在构造器的第一句
在同一类中this关键字调用其他的构造方法,而且参数包含进去的
*/

/*class Addstr{
  public double doubleStr;
  public int  str;
  public int  intStr;

  public double getDubleStr(String str1,String str2){
     BigDecimal  b1=new BigDecimal(str1);
     BigDecimal  b2=new BigDecimal(str2);
     BigDecimal  sum=b1.add(b2);
         double  sum_db=sum.setScale(3,RoundingMode.HALF_UP).doubleValue();
         return sum_db;
  }
  public  int getStrAdd(String str1,String str2){
          String strAdd=str1+str2;
          int sum=0;
          for (int i=0;i<strAdd.length()-1;i++) {
                char a=strAdd.charAt(i);
                if (a>=47||a<=57) {
                  a=a-47;
                }
                sum+=a;
          }
                return sum;
              /* String strAdd=str1+str2;
                return strAdd;*/
/*  }
  public  int  intStrAdd(String str1,String str2){

         int intStrAdd=Integer.parseInt(str1)+Integer.parseInt(str2);
           return intStrAdd;
  }

  public  void showResult(String str1,String str2){
    String strAdd=str1+str2;
    boolean flag;
    for (int i=0;i<strAdd.length()-1;i++) {
                char a=strAdd.charAt(i);
                if (a<=47||a>=57) {
                  flag=false;
                }else{
                  flag=true;
                }
          }
    if(str1.contains(".")&&str2.contains(".")&&flag)
    {
      System.out.println("字符串转换成整数相加的结果是："+intStrAdd(str1,str2));  
    }else if(str1.contains(".")||str2.contains("."))
    {
       System.out.println("字符串拼接的结果是："+getStrAdd(str1,str2));
    }else{
      System.out.println("字符串转换成浮点型数据相加求和的结果是："+getDubleStr(str1,str2));
    }  
  }
}
class Demo{
  public static void main(String[] args) {
    String str1=new Scanner(System.in).next();
    String str2=new Scanner(System.in).next(); 
    Addstr  a=new Addstr();
    a.showResult(str1,str2);    
  }
}*/

/*class Person{
  public String name;
  public String major;
  public void getName () {
    System.out.println("我的名字是："+name);
  }
}
class Demo{
  public static void main(String[] args) {
    Person p1=new Person();
     Person p2=new Person();
    //setName(p1);
    System.out.println("我的名字是："+ setName(p1));

  }
  public static String setName(Person p1){
    return new Person().name="张三";
  }
}*/


/*class Student{
  private String name;
  private int  age;
  private boolean gender;
  private String major;

  public void setName(String newName){
      if (newName==null) {
        name=null;
      }else{
        name=newName;
      }
      //name=newName==null?null:newName;
  }
  public String getName(){
      return  name;
  }
  public void setAge(int newAge){
     if (newAge>=0&&newAge<=200) {
          age=newAge;
     }else{
          age=0;
     }
  }
  public int getAge() {
      if (age==0) {
          System.out.println("年龄未定义或定义错误");
          return age=0;
      }else {
          return age;
      }
  }
  public String getMajor() {
    /* if (major==null) {
        return major=null;
     }else{
        return major;
     }
     return major;
  }
}
class Demo{
  public static void main(String[] args) {
     Student  s1=new Student();
     s1.setName("zhangsan");
     s1.setAge(23);
     System.out.println("学生的姓名是："+s1.getName());
     System.out.println("学生的年龄是："+s1.getAge());
      System.out.println("学生专业是："+s1.getMajor());
  }
}*/

/*class Animal{
  private String name;
  private String country;

  public Animal() {

  }
}*/
 class Animal{
    private String name;
    private String country;
    public int age;

   public Animal(){  
      System.out.println("无参的构造函数"); 
      System.out.println(this.name+"----"+this.country+"-----"+this.age);    
   }  
   public Animal(String name,String country){  
      this();
      this.name=name;
      this.country=country;
      System.out.println("2个参数的构造函数");  
      System.out.println(this.name+"----"+this.country+"-----"+this.age);   
   }
     public Animal(String name,String country,int age){
      this("老虎","China");  
      this.name=name;
      this.country=country;
      this.age=age;
      System.out.println("3个参数的构造函数");
      System.out.println(this.name+"----"+this.country+"-----"+this.age);   
   }
   /* public String getName(){
          return name;
    }
     public String getCountry(){
          return country;
    }
     public int getAge(){
          return age;
    }
    public Animal(int newAge){
          age=newAge; 
     }*/
  /* public Animal(boolean flag){  
      System.out.println("构造方法也可以重构"+flag);  
   } */  
}  

class Demo{  
   public static void main(String [] args){ 
      System.out.println("-----------空参------------");
      Animal a1=new Animal();

       System.out.println("------------一个参数-------------");
      Animal a2=new Animal("老虎","China");
      //System.out.println(a2.getName());
      //System.out.println(a2.getCountry());
      System.out.println("--------------3个参数--------");
      Animal a3=new Animal("狮子","中国",20);
     // System.out.println(a3.getAge());
     /*Animal a3=new Animal(2); 
      Animal a4=new Animal(true); */
   }  
}  