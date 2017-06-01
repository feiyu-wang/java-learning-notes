package student;

import java.util.Scanner;

public class Student {
	public String name;
	public int age;
	public boolean sex;
	public String education;
	public String school;
	public String major;
	public static  Student [] StudentArr =new Student[7];
	static
	{
		StudentArr[0]=new Student("张三1",21,false,"大专","西安理工大学","计算机科学与技术1");
		StudentArr[1]=new Student("张三2",20,false,"大专","西安理工大学","计算机科学与技术2");
		StudentArr[2]=new Student("张三3",20,false,"二本","西安理工大学","计算机科学与技术3");
		StudentArr[3]=new Student("张三4",20,true,"大专","西安理工大学","计算机科学与技术4");
		StudentArr[4]=new Student("张三5",18,false,"一本","西安理工大学","计算机科学与技术5");
		StudentArr[5]=new Student("张三6",22,true,"大专","西安理工大学","计算机科学与技术6");
		StudentArr[6]=new Student("张三7",23,false,"三本","西安理工大学","计算机科学与技术7");
	}
	/*enum Type{
		Age,Education,
	}*/
	public  Student(){
		while (true) {
			System.out.println("1、查询出所有年龄大于20（不含）的学员信息");
			System.out.println("2、查询出所有学历是大专的学员");
			System.out.println("3、查询出所有女生的信息");
			System.out.println("4、将学历一本学员的学校改为长安大学");
			System.out.println("5、打印所有学员信息");
			System.out.println("按其它数字退出操作");
			int type=new Scanner(System.in).nextInt();
			switch (type) {
			case 1:query(type);break;
			case 2:query(type);break;
			case 3:query(type);break;
			case 4:query(type);break;
			case 5:query(type);break;
			default:query(type);break;
			}
			if (type>5||type<=0) {
				System.out.println("再见");
				break;
			}
		}
	}
	public  Student(String name,int age,boolean sex,String education,String school,String major){
		this.age=age;
		this.name=name;
		this.sex=sex;
		this.education=education;
		this.school=school;
		this.major=major;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	public String toString(){
		return "姓名"+this.name+"年龄"+this.age+"性别"+(this.sex?"女":"男")+"学历"+this.education+"学校"+this.school+"专业"+this.major;
	}
	 
	public void query(int type){
		for (int i = 0; i < StudentArr.length; i++) {
			if (StudentArr[i].age>20&&type==1) {
				System.out.println(StudentArr[i].toString());
			}else if (StudentArr[i].education.equals("大专")&&type==2) {
				System.out.println(StudentArr[i].toString());
			}else if (StudentArr[i].sex&&type==3) {
				System.out.println(StudentArr[i].toString());
			}else if (StudentArr[i].education.equals("一本")&&type==4) {
				StudentArr[i].setSchool("长安大学");
				System.out.println(StudentArr[i].toString());
			}else if (type==5) {
				System.out.println(StudentArr[i].toString());
			}
			
		}
	}

	
}
