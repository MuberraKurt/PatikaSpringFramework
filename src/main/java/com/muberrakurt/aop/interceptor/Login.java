package com.muberrakurt.aop.interceptor;

@Interceptor1
public class Login {

    public String isLoginMethod(String data){
        return "isLogin: "+data;
    }
}
