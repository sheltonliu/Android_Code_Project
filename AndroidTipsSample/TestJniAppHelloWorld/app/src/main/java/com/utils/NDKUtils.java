package com.utils;

/**
 * Created by liushuo on 17/6/25.
 */

public class NDKUtils {

    public static native String sayHello();

    public native String MyNewString(char cc, int len);

    public void printString(String str){
        System.out.print("ss:  "+str);
    }

    public int genRandomInt(int max){
        return  0;
    }

    static {
        System.loadLibrary("JniTest");

    }
}
