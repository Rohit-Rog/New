package com.demoproj;

public class demoProj {
    int id;
    String name;
    int age;

    public demoProj(int id,String name,int age){
        this.name=name;
        this.age=age;
        this.id=id;
    }

    public boolean isAdult(){
        if(this.age>=18){
            return true;
        }
        else{
            return false;
        }
    }
}
