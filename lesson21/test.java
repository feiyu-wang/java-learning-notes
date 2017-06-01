class Out
{
	public int a = 1;
	public void get()
	{
       final int b = 2;
	   class Inner
		{
			public int a =2;
		   public void get()
			{
		   System.out.println(a);
			}
	   }
	    System.out.println(a);
	}

	public static void main(String[] args) 
	{
		Out.Inner  in= new Out().new Inner();
		in.get();
	}
}
/* Outer outer = new Outer();
        Inner inner =  new Outer().new Inner()*/
        // Out.In in = new Out().new In();