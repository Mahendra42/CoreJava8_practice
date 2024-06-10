package org.example.java8.features.functionInterfaces.supplier;

import java.util.function.Supplier;

public class RandomPwd {
    public static void main(String... args){
        Supplier<Integer> pwdgen=()-> (int) (Math.random() * 10);
        String pwd="";
        for(int i=0;i<4;i++){
            pwd+=pwdgen.get();
        }
        System.out.println(pwd);

    }

}
