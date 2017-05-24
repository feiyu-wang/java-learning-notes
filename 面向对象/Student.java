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
	public int sumScore(){
		int sum=0;
		return sum=javaScore+englishScore+chineseScore;
	}
	public void print(){
		System.out.println("姓名："+name+" 年龄："+age+" java成绩是："+javaScore+" 英语成绩是："+englishScore+" 语文成绩是："+chineseScore);
	}
}

class getScore{
	public static void main(String[] args) {
		Student s1=new Student("张三",18,70,81,99);
		Student s2=new Student("李四",19,80,69,77);
		Student s3=new Student("王五",22,91,81,95);
		/*int score1=s1.compareScore();
		int score2=s2.compareScore();
		int score3=s3.compareScore();*/
		int max=0;
		max= Math.max(s3.sumScore(),Math.max(s1.sumScore(),s2.sumScore()));
		System.out.println(max);
		if (s1.sumScore()==max) {
			s1.print();
		}else if (s1.sumScore()==max) {
			s2.print();
		}else{
			s3.print();
		}
	}
}