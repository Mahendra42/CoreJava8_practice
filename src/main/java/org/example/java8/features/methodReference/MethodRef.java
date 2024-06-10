package org.example.java8.features.methodReference;

import com.sun.jdi.Method;

public class MethodRef {
    MethodRef(){

    }

    public MethodRef constructor(){
        return new MethodRef();
    }
    public static void m1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("static method reference" + i);
        }
    }
    public void m2() {
            for (int i = 0; i < 5; i++) {
                System.out.println("instance method reference" + i);
            }
    }
    public static void main(String[] args) {
        Thread t=new Thread(MethodRef::m1);
        t.start();
        System.out.println("Main Method Executed..");

        MethodRef mref=new MethodRef();
        Thread t1=new Thread(mref::m2);
        t1.start();

        //MethodRef mobj= MethodRef::new;


    }
}
