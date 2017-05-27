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
/*class Single{
	private int age;
	private Single(){}
	private Single(int age){
		this.age=age;
	}

	private  static Single Single=null;
	public static Single getSingle(){
		if (Single==null) {
			Single=new Single(27);
		}
		return  Single;
	}
	
}
class Demo{
	public static void main(String[] args) {
		Single s1=Single.getSingle();
		Single s2=Single.getSingle();
		Single s3=Single.getSingle();
		/*Single2 s1=Single2.getSingle();
		Single2 s2=Single2.getSingle();
		Single2 s3=Single2.getSingle();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}
}*/

/*class Single2
{
	private Single2(){};
	private static Single2 single2 = null;
	public static synchronized Single2 getSingle()
	{
		if(single2==null)
		{
			// 线程A ---锁定数据
			// 线程B 
			single2 = new Single2();
		}
	    return single2;
	}
}*/

//懒汉式变种：解决线程安全问题，消耗cpu
class Single2{
	private Single2(){

	}
	private static Single2 Single2=null;
	public static synchronized Single2 getSingle(){
		if(Single2==null)
		{
			// 线程A ---锁定数据
			// 线程B 
			Single2 = new Single2();
		}
	    return Single2;
	}
	public static void main(String[] args) {
		Single2 s1=Single2.getSingle();
		Single2 s2=Single2.getSingle();
		Single2 s3=Single2.getSingle();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}
}

//饿汉式 ：
class Single3{
	private Single3(){

	}
	private static Single3 Single3=new Single3();
	public static Single3  getSingle(){
			return Single3;
	}
	public static void main(String[] args) {
		Single3 s1=Single3.getSingle();
		Single3 s2=Single3.getSingle();
		Single3 s3=Single3.getSingle();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}
}


//饿汉式变种
class Single4{
	private Single4(){

	}
	private static Single4 Single4=null;
	static{
		Single4=new Single4();
	}
	public static Single4 getSingle(){
		return Single4;
	}
	public static void main(String[] args) {
		Single4 s1=Single4.getSingle();
		Single4 s2=Single4.getSingle();
		Single4 s3=Single4.getSingle();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}

//双重校验锁，解决懒汉式多线程安全问题
class Single5
{
	private Single5(){}
	private static volatile Single5 single5;
	public static Single5 getSingle()
	{
        if(single5==null)
		{
			synchronized(Single5.class)
			{
				if(single5==null)
				{
					single5 = new Single5();
				}
			}
		}
		return single5;
	}
}
// synchronized volatile 