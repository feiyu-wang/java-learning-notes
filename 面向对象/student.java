import  java.math.*;
class Student{
	private String  name;
	private int  age;
	private int javaScore;
	private int englishScore;
	private int chineseScore;
	public  Student () {
		System.out.println("空参的构造函数");
	}
	public Student(int age,String name){
		this.age=age;
		this.name=name;
		System.out.println("两个的构造函数");
	}
	public Student(String name,int age,int javaScore,int englishScore,int chineseScore){
		this.name=name;
		this.age=age;
		this.javaScore=javaScore;
		this.englishScore=englishScore;
		this.chineseScore=chineseScore;
		System.out.println("全参的构造函数");
	}
	public void setName(String name){
		if (name==null) {
			this.name=null;
			System.out.println("姓名未定义");
		}else{
			this.name=name;
		}
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
			if (age>200||age<0) {
				this.age=0;
				System.out.println("年龄定义有误");
			}else{
				this.age=age;
			}
	}
	public int getAge(){
		return age;
	}
	public void setJava(int java){
		if (java>100||java<0) {
			this.javaScore=0;
			System.out.println("分数定义有误");
		}else{
			this.javaScore=java;
		}
	}
	public int getJava(){
		return javaScore;
	}
	public void setChinese(int chinese){
		if (chinese>100||chinese<0) {
			this.chineseScore =0;
			System.out.println("分数定义有误");
		}else{
			this.chineseScore=chinese;
		}
	}
	public int getChinese(){
		return javaScore;
	}
	public void setEnglisn(int english){
		if (english>100||english<0) {
			this.englishScore=0;
			System.out.println("分数定义有误");
		}else{
			this.englishScore=english;
		}
	}
	public int getEnglish(){
		return javaScore;
	}
	public int sumScore(){
		int sum=0;
		return sum=javaScore+englishScore+chineseScore;
	}
	/*public void print(){
		System.out.println("姓名："+name+" 年龄："+age+" java成绩是："+javaScore+" 英语成绩是："+englishScore+" 语文成绩是："+chineseScore);
	}*/
	public void getMaxPrint(Student s1,Student s2,Student s3){
		int max= Math.max(s3.sumScore(),Math.max(s1.sumScore(),s2.sumScore()));
		if (this.sumScore()==max) {
			System.out.println("姓名："+name+" 年龄："+age+" java成绩是："+javaScore+" 英语成绩是："+englishScore+" 语文成绩是："+chineseScore);
		}
	}
}

class getScore{
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("张三");
		s1.setAge(18);
		s1.setJava(70);
		s1.setEnglisn(81);
		s1.setChinese(99);
		System.out.println("姓名："+s1.getName()+" 年龄："+s1.getAge()+" java成绩是："+s1.getJava()+" 英语成绩是："+s1.getEnglisn()+" 语文成绩是："+s1.getChinese());
		Student s2=new Student("李四",19,80,69,77);
		Student s3=new Student("王五",22,91,81,95);
		s1.getMaxPrint(s1,s2,s3);
		s2.getMaxPrint(s1,s2,s3);
		s3.getMaxPrint(s1,s2,s3);
	}
}