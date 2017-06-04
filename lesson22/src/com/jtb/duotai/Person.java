/**  
* @Title:  Person.java
* @Package com.jtb.duotai
* @Description: TODO(用一句话描述该文件做什么)
* @author 牛迁迁
* @date  2017-6-2 上午09:24:02
* @version V1.0  
* Update Logs:
* ****************************************************
* Name:
* Date:
* Description:
******************************************************
*/
package com.jtb.duotai;
/**
 * @ClassName: Person
 * @Description: 
 * @author jiatengbin
 * @date 2017-6-2 上午09:24:02
 */
public class Person 
{
	String nameString;
	int age;
	
    /**
	 * 空参的构造方法
	 */
	public Person() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
  
	/**
	 * 全参的构造方法
	 * @param nameString
	 * @param age
	 */
	public Person(String nameString, int age) 
	{
		super();
		this.nameString = nameString;
		this.age = age;
	}

    protected void show()
    {
	  System.out.println("person show");
   }
    // 覆盖Objetct类的hashCode()去生成实体类的成员变量值得哈希码
    public int hashCode()
    {
    	final int prime = 31;
    	int result = 1; // 最终的哈希吗值
    	result = result * prime +age;
    	result = result * prime + (nameString==null?0:nameString.hashCode());
    	return result;
    }
    public boolean equals(Object obj)
    {
    	//首先先比较传进来的比较的对象是够为空，如果空对象，直接就是false
    	if(obj==null)
    	{
    		return false;
    	}
    	// 假如穿件来的不是空对象，那么先判断传入的obj对象是否是Person类
    	if(obj instanceof Person)
    	{
    		// obj判定是Person类型
    		// 紧着必须要判断要比较的俩个person对象的成员变量的值是否相等，
    		// 如果值相等，那就说明是同一个对象，否则就不是同一个对象
    		Person p = (Person)obj;
    		if(p.nameString.equals(nameString)&&p.age==age)
    		{
    			return true;
    		}
    		else
    		{
			   return false;	
			}
    	}
    	else
    	{
    		// 如果obj不是person类型的对象
    		return false;
    	}
    }
}


