package com.xmal.sys;
/*Door（门类）*/
public class Door {
    private String state   = "电子门关闭"; // 电子门状态
    private boolean ring = false; //门铃状态

    //构造方法
    public Door(){
    }
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
