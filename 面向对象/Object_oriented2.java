import  java.util.*;
import  java.math.*;
class Demo{
	public static void main(String[] args) {
		String str1=new Scanner(System.in).next();
		String str2=new Scanner(System.in).next();
		Demo add=new Demo();
		add.showAdd(str1,str2);
	}
		 
	public static String addStr(String str1,String str2){
			return  str1+str2;
	}
	public static int addIntStr(String str1,String str2){
		    return Integer.parseInt(str1)+Integer.parseInt(str2);
	}
	public static double addDoubleStr(String str1,String str2){
		 	BigDecimal b1=new BigDecimal(str1);
		 	BigDecimal b2=new BigDecimal(str2);
		 	MathContext mc = new MathContext(5,RoundingMode.HALF_UP);   
		 	BigDecimal sum_big=b1.add(b2,mc);
		 	double sum_db=sum_big.doubleValue();
		 	return sum_db;
	}
	public static void showAdd(String str1,String str2) {
	 if (str1.cotains(".")||str2.cotains(".")) {
	 	System.out.println("字符串相加的结果是："+addStr(str1,str2));
		System.out.println("浮点数相加的结果是："+addIntStr(str1,str2));
	 }else{
	 	System.out.println("整数相加的结果是："+addIntStr(str1,str2));
	 }
	}
}