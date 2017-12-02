package com.dengjunw.maven;

/**
 * Created by dengjunwu on 2017/10/31.
 */
public class HelloMaven {
    public String sayHello(){
        return "Hello Maven";
    }

    public static void main(String[] args){
        System.out.println(new HelloMaven().sayHello());
    }
}
