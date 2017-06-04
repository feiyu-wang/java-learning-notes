package com.xmal.sys;
/*Door（门类）*/
public class Door {
   /* public  static String open  = "电子门开启"; 
    public  static String close = "电子门关闭"; */
    private String state   = "电子门关闭"; // 电子门状态
    private boolean ring = false; //门铃状态

    //构造方法
    public Door(){
       // this.setState(close);
    }

    //开启电子门
   /* public void open(){
        this.setState(open);
    }

    //关闭电子门
    public void close(){
        this.setState(close);
    }
*/
    //setter/getter
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public boolean getRing() {
        return ring;
    }
    public void setRing(boolean ring) {
        this.ring = ring;
    }
}
