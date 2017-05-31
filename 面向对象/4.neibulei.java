 //内部类

 /*1.类A中去调用类B的方法，同时类B可能去调用类A的方法，类B定义到类A的内部
 2.类中定义一个类，相互之间可以调用
 3.成员内部类
 4.静态内部类
 5.局部内部类
 6.匿名内部类(起到了内部类的作用，但是没有class 关键字)
   -----------抽象类和接口用到匿名内部类，此处不详解。*/

 /*class Outer｛
	 private int outer_i=10;
	 public void test() {
	 	System.out.pritntln("test outer_i-==="+outer_i);
	 	Inner in=new Inner();
	 	in.pritnt();
	 	//外部类不能直接访问内部类的成员变量和成员方法，
	 	//必须先生成内部类的实例对象，通过内部类的实例对象去调用内部类的成员及方法
	 }
	 System.out.pritntln("inner_i=="+in.inner_i);

	 class Inner{
	 	public int inner_i=11;
	 	public void pritnt(){
	 		System.out.pritntln(outer_i);
	 	}
	 }
 ｝*/


 class Outer { 
    public static void main(String[] args) { 
        Outer out = new Outer(); 
       // outer.print();
        out.print(); 
 
        //inner = outer.getInner(); 
        //inner.print("Outer.get"); 
    } 
 	/*public int age=10;
 	public void print(){
 		 System.out.println(this.age); 
 	}
    static class Inner { 
    	public int age=20;
        public void print() { 
            System.out.println(this.age); 
            Inner in =new Inner();
            System.out.println(in.age);
            System.out.println(this.age);
            Outer out =new Outer();
            System.out.println(out.age);
        } 
    } */
    public int age=10;
    public void print (){
    	int age=20;
    	class Inner{
    		public int age=30;
    		public void print(){
    			int age=40;
    			System.out.println("age="+age);
    			System.out.println("inner age"+this.age);
    			System.out.println("out age"+Outer.this.age);
    		}
    	}
    	Inner in=new Inner();
    	in.print();
    }
}
