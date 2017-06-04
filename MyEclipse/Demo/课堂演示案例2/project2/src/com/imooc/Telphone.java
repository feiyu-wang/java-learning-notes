package com.imooc;

public class Telphone {
    private float screen;
	private float cpu;
	private float mem;
	
	public void sendMessage(){
		System.out.println("sendMessage");
	}
	
	public float getScreen() {
		return screen;
	}
	public void setScreen(float screen) {
		this.screen = screen;
		this.sendMessage();
	}
	public float getCpu() {
		return cpu;
	}
	public void setCpu(float cpu) {
		this.cpu = cpu;
	}
	public float getMem() {
		return mem;
	}
	public void setMem(float mem) {
		this.mem = mem;
	}
	public Telphone(){
		System.out.println("com.imooc.Telphone 无参的构造方法执行了!");
	}
	public Telphone(float newScreen,float newCpu,float newMem){
		if(newScreen<3.5f){
			System.out.println("您输入的数据不正确，设置了一个最小的默认值。");
			screen = 3.5f;
		}
		cpu = newCpu;
		mem = newMem;
		System.out.println("有参的构造方法行了!");
	}
}
