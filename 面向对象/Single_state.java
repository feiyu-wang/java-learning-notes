/*单态设计模式
	保证一个类在内存的对象是唯一的。
	如何保证对象是唯一的
	思想
		1.不让其他程序创建该类对象
		2.在本类中创建一个本类对象
		3.对外提供方法。让其他程序获取这个对象
		步骤
		1私有化构造方法
		2创建私有并静态的本类对象
		3定义共有并静态的方法，返回该对象
单态设计模式总共6种写法*/
//懒汉式单态
//问题 ：线程安全问题
class Single{
	private String age;
	private Single(){}
	private  static Single Single=null;
	public static Single getSingle(){
		if (Single==null) {
			Single Single=new Single();
		}
		return  Single;
	}
	
}
class Demo{
	public static void main(String[] args) {
		Single s1=Single.getSingle();
		Single s2=Single.getSingle();
		Single s3=Single.getSingle();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}

//懒汉式变种：解决线程安全问题，消耗cpu
/*class Single2{
	private Single2(){};
	private static Single2 Single2=null;
	public static Synchronzied getSingle2(){
		if (Single2==null) {
			Single2 Single2=new Single2();
		}
		return Single2;
	}
}*/

//饿汉式 ：
class Single3{
	private Single3(){};
	private static Single3 Single3=new Single3();
	public static Synchronzied getSingle3(){
		if (Single2==null) {
			Single3 Single3=new Single3();
		}
		return Single3;
	}
}
