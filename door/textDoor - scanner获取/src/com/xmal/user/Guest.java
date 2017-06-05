package com.xmal.user;
import com.xmal.sys.Door;


public class Guest {
    private String name;   

    public Guest(){

    }

    public Guest(String name){
        this.name = name;
    }

 
    public void pressRing(Door door){
        System.out.println(this.getName()+"按门铃，请求管理员打开电子门");
        door.setRing(true);   
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
