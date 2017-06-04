/**  
* @Title:  Person.java
* @Package com.jtb.duotai
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author ţǨǨ
* @date  2017-6-2 ����09:24:02
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
 * @date 2017-6-2 ����09:24:02
 */
public class Person 
{
	String nameString;
	int age;
	
    /**
	 * �ղεĹ��췽��
	 */
	public Person() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
  
	/**
	 * ȫ�εĹ��췽��
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
    // ����Objetct���hashCode()ȥ����ʵ����ĳ�Ա����ֵ�ù�ϣ��
    public int hashCode()
    {
    	final int prime = 31;
    	int result = 1; // ���յĹ�ϣ��ֵ
    	result = result * prime +age;
    	result = result * prime + (nameString==null?0:nameString.hashCode());
    	return result;
    }
    public boolean equals(Object obj)
    {
    	//�����ȱȽϴ������ıȽϵĶ����ǹ�Ϊ�գ�����ն���ֱ�Ӿ���false
    	if(obj==null)
    	{
    		return false;
    	}
    	// ���紩�����Ĳ��ǿն�����ô���жϴ����obj�����Ƿ���Person��
    	if(obj instanceof Person)
    	{
    		// obj�ж���Person����
    		// ���ű���Ҫ�ж�Ҫ�Ƚϵ�����person����ĳ�Ա������ֵ�Ƿ���ȣ�
    		// ���ֵ��ȣ��Ǿ�˵����ͬһ�����󣬷���Ͳ���ͬһ������
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
    		// ���obj����person���͵Ķ���
    		return false;
    	}
    }
}


