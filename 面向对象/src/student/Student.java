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
		StudentArr[0]=new Student("����1",21,false,"��ר","��������ѧ","�������ѧ�뼼��1");
		StudentArr[1]=new Student("����2",20,false,"��ר","��������ѧ","�������ѧ�뼼��2");
		StudentArr[2]=new Student("����3",20,false,"����","��������ѧ","�������ѧ�뼼��3");
		StudentArr[3]=new Student("����4",20,true,"��ר","��������ѧ","�������ѧ�뼼��4");
		StudentArr[4]=new Student("����5",18,false,"һ��","��������ѧ","�������ѧ�뼼��5");
		StudentArr[5]=new Student("����6",22,true,"��ר","��������ѧ","�������ѧ�뼼��6");
		StudentArr[6]=new Student("����7",23,false,"����","��������ѧ","�������ѧ�뼼��7");
	}
	/*enum Type{
		Age,Education,
	}*/
	public  Student(){
		while (true) {
			System.out.println("1����ѯ�������������20����������ѧԱ��Ϣ");
			System.out.println("2����ѯ������ѧ���Ǵ�ר��ѧԱ");
			System.out.println("3����ѯ������Ů������Ϣ");
			System.out.println("4����ѧ��һ��ѧԱ��ѧУ��Ϊ������ѧ");
			System.out.println("5����ӡ����ѧԱ��Ϣ");
			System.out.println("�����������˳�����");
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
				System.out.println("�ټ�");
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
		return "����"+this.name+"����"+this.age+"�Ա�"+(this.sex?"Ů":"��")+"ѧ��"+this.education+"ѧУ"+this.school+"רҵ"+this.major;
	}
	 
	public void query(int type){
		for (int i = 0; i < StudentArr.length; i++) {
			if (StudentArr[i].age>20&&type==1) {
				System.out.println(StudentArr[i].toString());
			}else if (StudentArr[i].education.equals("��ר")&&type==2) {
				System.out.println(StudentArr[i].toString());
			}else if (StudentArr[i].sex&&type==3) {
				System.out.println(StudentArr[i].toString());
			}else if (StudentArr[i].education.equals("һ��")&&type==4) {
				StudentArr[i].setSchool("������ѧ");
				System.out.println(StudentArr[i].toString());
			}else if (type==5) {
				System.out.println(StudentArr[i].toString());
			}
			
		}
	}

	
}
