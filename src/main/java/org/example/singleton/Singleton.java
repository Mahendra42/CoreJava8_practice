package org.example.singleton;

public class Singleton {
    private static Singleton singleton;
    private Singleton(){
    }
    public static Singleton getinstance(){
        if(singleton==null){
             singleton=new Singleton();
        }
        return singleton;
    }

}

class main{
    public static void main(String... args){
        Singleton singleton1 = Singleton.getinstance();
        Singleton singleton2 = Singleton.getinstance();
        System.out.println(singleton2.hashCode()+" .... "+ singleton1.hashCode());
    }
}
