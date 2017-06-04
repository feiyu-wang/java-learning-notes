/**  
* @Title:  Student.java
* @Package com.jtb.bao
* @Description: TODO(用一句话描述该文件做什么)
* @author 牛迁迁
* @date  2017-6-2 上午09:19:13
* @version V1.0  
* Update Logs:
* ****************************************************
* Name:
* Date:
* Description:
******************************************************
*/
package com.jtb.bao;
import com.jtb.duotai.Person;


/**
 * @ClassName: Student
 * @Description:学生类
 * @author jiatengbin
 * @date 2017-6-2 上午09:19:13
 * 
 * protected 修饰的方法只能是子类对象去调用
 * 
 * "张三1,21,男,大专,西安理工大学,计算机科学与技术1;
 */
public class Student extends Person
{
   private String name;
   private int age;
   private boolean gender;
   private String degree;
   private String school;
   private String major;
/**
 * 
 */
public Student() 
{
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param nameString
 * @param age
 */
public Student(String nameString, int age)
{
	super(nameString, age);
	// TODO Auto-generated constructor stub
}
/**
 * @param name
 * @param age
 * @param gender
 * @param degree
 * @param school
 * @param major
 */
public Student(String name, int age, boolean gender, String degree,
		String school, String major) 
{
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.degree = degree;
	this.school = school;
	this.major = major;
}
/**
 * @return the name
 */
public String getName()
{
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) 
{
	this.name = name;
}
/**
 * @return the age
 */
public int getAge() 
{
	return age;
}
/**
 * @param age the age to set
 */
public void setAge(int age)
{
	this.age = age;
}
/**
 * @return the gender
 */
public boolean isGender() 
{
	return gender;
}
/**
 * @param gender the gender to set
 */
public void setGender(boolean gender) 
{
	this.gender = gender;
}
/**
 * @return the degree
 */
public String getDegree() 
{
	return degree;
}
/**
 * @param degree the degree to set
 */
public void setDegree(String degree)
{
	this.degree = degree;
}
/**
 * @return the school
 */
public String getSchool() 
{
	return school;
}
/**
 * @param school the school to set
 */
public void setSchool(String school)
{
	this.school = school;
}
/**
 * @return the major
 */
public String getMajor() 
{
	return major;
}
/**
 * @param major the major to set
 */
public void setMajor(String major)
{
	this.major = major;
}
/* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() 
{
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + age;
	result = prime * result + ((degree == null) ? 0 : degree.hashCode());
	result = prime * result + (gender ? 1231 : 1237);
	result = prime * result + ((major == null) ? 0 : major.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((school == null) ? 0 : school.hashCode());
	return result;
}
/* (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
@Override
public boolean equals(Object obj) 
{
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (age != other.age)
		return false;
	if (degree == null) {
		if (other.degree != null)
			return false;
	} else if (!degree.equals(other.degree))
		return false;
	if (gender != other.gender)
		return false;
	if (major == null) {
		if (other.major != null)
			return false;
	} else if (!major.equals(other.major))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (school == null) {
		if (other.school != null)
			return false;
	} else if (!school.equals(other.school))
		return false;
	return true;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() 
{
	return "Student [age=" + age + ", degree=" + degree + ", gender=" + gender
			+ ", major=" + major + ", name=" + name + ", school=" + school
			+ "]";
}  
   
}
