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

class Complex{
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

（a+bi）/（c+di）=[（ac+bd）/（c²+d²）]+[（bc-ad）/（c²+d²）]i.*/

	/*public void numRide(Complex a,Complex b){
		System.out.println(a.realNum*b.realNum-a.noNum*b.noNum+"+"+(b.realNum*a.noNum+a.realNum*b.noNum)+"*i");
	}
	public void numExcept(Complex a,Complex b){
		double c=(double)(a.realNum*b.realNum+a.noNum*b.noNum)/(double)(b.realNum*b.realNum+b.noNum*b.noNum);
		double d=(double)(b.realNum*a.noNum-a.realNum*b.noNum)/(double)(b.realNum*b.realNum+b.noNum*b.noNum);
		System.out.println(c+"+"+d+"*i");
	}*/
	//public int noNumAdd()
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
		c1.numExcept(c1,c2);*/
		//System.out.println();
	}
}
