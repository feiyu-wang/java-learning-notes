/*class Outer{
	public int age=20;
	class Inner{
		public int age=10;
		public void fun(){
			int age=5;
			System.out.println(age);
			System.out.println(this.age);
			System.out.println(Outer.this.age);
		}
	}
	public static void main(String[] args) {
		Inner in=new Outer().new Inner();
		in.fun();
	}
}
*/

/*class Outer{
	public int age=20;
	public void fun2() {
	class Inner{
		public int age=10;
		public void fun(){
			int age=5;
			System.out.println(age);
			System.out.println(this.age);
			System.out.println(Outer.this.age);
		}
	}
		Inner in =new Inner();
		in.fun();
	}
	public static void main(String[] args) {
		Outer out=new Outer();
		out.fun2();
	}
}*/


/*class Outer{
	public int age=20;
	static class Inner{
		public int age=10;
		public void fun(){
			int age=5;
			System.out.println(age);
			System.out.println(this.age);
			//System.out.println(Outer.age);
		}
	}
	public static void main(String[] args) {
		Inner in=new Outer.Inner();
		in.fun();
	}
}*/



/*单态设计*/

class Sign{
	private int age;
	private Sign(){

	}
	private Sign(int age){
		this.age=age;
	}
	public static Sign sign=null;
	public static Sign getSign(){
		if (sign==null) {
			sign=new Sign(); 
		}
		return  sign;
	}
}


class Sign2{
	private int age;
	private Sign2(){

	}
	public static Sign2 sign2=null;
	public static synchronized Sign2 getSign2(){
		if (sign2==null) {
			sign2=new Sign2();
		}
	}
	return  sign2;
}


class  Sign3{
	private int age;
	private Sign3(){

	}
	private static Sign3 sign3=new Sign3();
	public  static Sign3 getSign3(){
		return  sign3;
	}
}

class  Sign4{
	private int age;
	private Sign4(){

	}
	private static Sign4 sign4=null;
	{
		sign4=new Sign4();
	}
	public  static Sign4 getSign4(){
		return  sign4;
	}
}