package com.imooc;

public class Initail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telphone tel1 = new CellPhone();
		tel1.call();
		tel1.message();
		Telphone tel2 = new SmartPhone();
		tel2.call();
		tel2.message();
		
		IPlayGame ip1 = new SmartPhone();
		ip1.playGame();
		IPlayGame ip2 = new Psp();
		ip2.playGame();
	}

}
