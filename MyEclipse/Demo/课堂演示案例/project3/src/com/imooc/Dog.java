package com.imooc;

public class Dog extends Animal {
	public int age = 20 ;
	public void eat(){
		System.out.println("�����гԹ�ͷ������");
	}
	public void method(){
		eat();
	}

	public Dog(){
		System.out.println("Dog�๹�췽��ִ����");
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		return true;
	}
	
}
