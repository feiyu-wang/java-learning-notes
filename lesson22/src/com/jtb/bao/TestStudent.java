/**  
* @Title:  TestStudent.java
* @Package com.jtb.bao
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author ţǨǨ
* @date  2017-6-2 ����02:09:57
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
 * @Description:ҵ����
 * @author jiatengbin
 * @date 2017-6-2 ����02:09:57
 * =================================================================
 * 1. ��������Ϣ��
"����1,21,��,��ר,��������ѧ,�������ѧ�뼼��1;
����2,20,��,��ר,��������ѧ,�������ѧ�뼼��2;
����3,20,��,����,��������ѧ,�������ѧ�뼼��3;
����4,20,Ů,��ר,��������ѧ,�������ѧ�뼼��4;
����5,18,��,һ��,��������ѧ,�������ѧ�뼼��5;
����6,22,Ů,��ר,��������ѧ,�������ѧ�뼼��6;
����7,23,��,����,��������ѧ,�������ѧ�뼼��7"
����Ҫ�������ϵͳ��������¹��ܣ�
1����ѯ�������������20����������ѧԱ��Ϣ
2����ѯ������ѧ���Ǵ�ר��ѧԱ
3����ѯ������Ů������Ϣ
4����ѧ��һ��ѧԱ��ѧУ��Ϊ"������ѧ"
5����ӡ����ѧԱ��Ϣ
��ʾ��ʽҪ�����£�
---------------------------------------
����  ����   �Ա�   ѧ��  ѧУ   רҵ
---------------------------------------
....
 */
public class TestStudent 
{

	/**
	 * ��һ����ѧ����Ϣ�ַ��������ÿ��ѧ����Ϣ�ֶζ���ȡ����������Ҫ��ȡ�������ַ����ֶ���Ϣ
	 * ���studentѧ�������
	 * 
	 * ʵ��˼·��
	 * 
	 * 1 ����Studentʵ���࣬���������ķ�װ
	 * 
	 * 2 ѧ���ַ�����ͨ��������һ�ν�ȡ����һ�ν�ȡ���ÿһ��ѧ��������ַ�����Ϣ
	 * 
	 * 3 ��ÿһ��ѧ�������ַ�����Ϣͨ����������ȡ������ѧ���ֶ���Ϣ
	 * 
	 * 4 ͨ��һ��forѭ������Щ�ַ����ֶ���Ϣ��ֵ��ѧ����������
	 * 
	 * ǰ4����Ҫ��ɶԿյ�ѧ����������ĳ�ʼ����ֵ
	 * 
	 * 5 ��ӡȫ��ѧ������������Ϣ-----��֤��ֵ���Ƿ���ȷ
	 * 
	 * 6 ��ѯ����ѧ����Ϣ���ô�ӡ����
	 * 
	 * ʵ�ֹ����ѵ㣺 
	 * 
	 * 1 
	 */
	static String data = "����1,21,��,��ר,��������ѧ,�������ѧ�뼼��1;����2,20,��,��ר,��������ѧ,�������ѧ�뼼��2;����3,20,��,����,��������ѧ,�������ѧ�뼼��3;����4,20,Ů,��ר,��������ѧ,�������ѧ�뼼��4;����5,18,��,һ��,��������ѧ,�������ѧ�뼼��5;����6,22,Ů,��ר,��������ѧ,�������ѧ�뼼��6;����7,23,��,����,��������ѧ,�������ѧ�뼼��7";
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
			// ��ÿһ��ѧ����Ϣ�ַ������ݡ������ָ�������
			String[] temp = strData[i].split(",");
			Student student = new Student();
			student.setName(temp[0]);
			student.setAge(Integer.parseInt(temp[1]));
			student.setGender(temp[2].equals("��")?true:false);
			student.setDegree(temp[3]);
			student.setSchool(temp[4]);
			student.setMajor(temp[5]);
			students[i] = student;
		}
	}	
	// ��ӡ���е�ѧ����������
	public void printStudent(Student[] students)
	{
		System.out.println("=============================================================");
		System.out.println("����\t����\t�Ա�\tѧ��\tѧУ\t\tרҵ");
		System.out.println("=============================================================");
		for(int i = 0; i<students.length;i++)
		{
			System.out.println(students[i].getName()+"\t"+students[i].getAge()
		    +"\t"+(students[i].isGender()?"��":"Ů")+"\t"+students[i].getDegree()
		   +"\t"+students[i].getSchool()+"\t"+students[i].getMajor());
		}
	}
	
	// ��ѯ�������20��ѧ��������Ϣ
	public Student[] getAge()
	{
		// �����ѧ����������---�����洢��ѯ���ķ���������ѧ��������Ϣ
		Student[] newStu  = {};
		int index = -1;// ��ѯ����ѧ������������±���ʼֵ
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
