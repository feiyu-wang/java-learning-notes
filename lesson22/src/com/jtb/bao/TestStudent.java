/**  
* @Title:  TestStudent.java
* @Package com.jtb.bao
* @Description: TODO(用一句话描述该文件做什么)
* @author 牛迁迁
* @date  2017-6-2 下午02:09:57
* @version V1.0  
* Update Logs:
* ****************************************************
* Name:
* Date:
* Description:
******************************************************
*/
package com.jtb.bao;

import java.util.Arrays;


/**
 * @ClassName: TestStudent
 * @Description:业务类
 * @author jiatengbin
 * @date 2017-6-2 下午02:09:57
 * =================================================================
 * 1. 有如下信息：
"张三1,21,男,大专,西安理工大学,计算机科学与技术1;
张三2,20,男,大专,西安理工大学,计算机科学与技术2;
张三3,20,男,二本,西安理工大学,计算机科学与技术3;
张三4,20,女,大专,西安理工大学,计算机科学与技术4;
张三5,18,男,一本,西安理工大学,计算机科学与技术5;
张三6,22,女,大专,西安理工大学,计算机科学与技术6;
张三7,23,男,三本,西安理工大学,计算机科学与技术7"
现需要自行设计系统，完成如下功能：
1、查询出所有年龄大于20（不含）的学员信息
2、查询出所有学历是大专的学员
3、查询出所有女生的信息
4、将学历一本学员的学校改为"长安大学"
5、打印所有学员信息
显示格式要求如下：
---------------------------------------
姓名  年龄   性别   学历  学校   专业
---------------------------------------
....
 */
public class TestStudent 
{

	/**
	 * 将一长串学生信息字符串里面的每个学生信息字段都截取出来，并且要截取出来的字符串字段信息
	 * 变成student学生类对象。
	 * 
	 * 实现思路：
	 * 
	 * 1 定义Student实体类，进行完整的封装
	 * 
	 * 2 学生字符串先通过；进行一次截取，这一次截取获得每一个学生对象的字符串信息
	 * 
	 * 3 将每一个学生对象字符串信息通过“，”截取，六个学生字段信息
	 * 
	 * 4 通过一个for循环将这些字符串字段信息赋值给学生对象数组
	 * 
	 * 前4步主要完成对空的学生对象数组的初始化赋值
	 * 
	 * 5 打印全部学生对象数组信息-----验证数值化是否正确
	 * 
	 * 6 查询到的学生信息调用打印方法
	 * 
	 * 实现过程难点： 
	 * 
	 * 1 
	 */
	static String data = "张三1,21,男,大专,西安理工大学,计算机科学与技术1;张三2,20,男,大专,西安理工大学,计算机科学与技术2;张三3,20,男,二本,西安理工大学,计算机科学与技术3;张三4,20,女,大专,西安理工大学,计算机科学与技术4;张三5,18,男,一本,西安理工大学,计算机科学与技术5;张三6,22,女,大专,西安理工大学,计算机科学与技术6;张三7,23,男,三本,西安理工大学,计算机科学与技术7";
	static String[] strData = data.split(";");
	static Student[] students = new Student[strData.length];
	public static void main(String[] args) 
	{
		TestStudent t = new TestStudent();
		t.printStr(strData);
		t.init();
		t.printStudent(students);
		t.printStudent(t.getAge());
	}
	
	public void init()
	{		
		for(int i = 0;i<strData.length;i++)
		{
			// 将每一个学生信息字符串根据’，‘分割后的数组
			String[] temp = strData[i].split(",");
			Student student = new Student();
			student.setName(temp[0]);
			student.setAge(Integer.parseInt(temp[1]));
			student.setGender(temp[2].equals("男")?true:false);
			student.setDegree(temp[3]);
			student.setSchool(temp[4]);
			student.setMajor(temp[5]);
			students[i] = student;
		}
	}	
	// 打印所有的学生对象数组
	public void printStudent(Student[] students)
	{
		System.out.println("=============================================================");
		System.out.println("姓名\t年龄\t性别\t学历\t学校\t\t专业");
		System.out.println("=============================================================");
		for(int i = 0; i<students.length;i++)
		{
			System.out.println(students[i].getName()+"\t"+students[i].getAge()
		    +"\t"+(students[i].isGender()?"男":"女")+"\t"+students[i].getDegree()
		   +"\t"+students[i].getSchool()+"\t"+students[i].getMajor());
		}
	}
	
	// 查询年龄大于20的学生对象信息
	public Student[] getAge()
	{
		// 定义空学生对象数组---用来存储查询到的符合条件的学生对象信息
		Student[] newStu  = {};
		int index = -1;// 查询到的学生对象数组的下标起始值
		for(int i = 0; i<students.length;i++)
		{
			if(students[i].getAge()>20)
			{
				newStu = Arrays.copyOf(newStu, newStu.length+1);
				index++;
				newStu[index] = students[i];
			}
		}
		return newStu;
	}
	public void printStr(String[] strs)
	{
		for(String string : strs)
		{
			System.out.println(string);
		}
	}

}
