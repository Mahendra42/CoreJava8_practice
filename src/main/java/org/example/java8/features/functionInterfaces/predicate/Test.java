package org.example.java8.features.functionInterfaces.predicate;

import java.util.function.Predicate;

public class Test {
    int[] arr={12,56,2,3,6,5,78,98,2,5,6,3,1,0,25,69};
    Predicate<Integer> p1= i->i>15;
    Predicate<Integer> p2=i->i%2==0;
    public static void main(String[] args) {
        Test t = new Test();
        t.processPredicates(t.p1,t.arr);
        t.processPredicates(t.p2,t.arr);
        //even and greater than
        t.processPredicates(t.p2.and(t.p1),t.arr);
        //even or greater
        t.processPredicates(t.p2.or(t.p1),t.arr);
        //negate
        t.processPredicates(t.p2.negate(),t.arr);


    }
    public void processPredicates(Predicate<Integer> predicate,int[] arr){
        for (int value : arr ) {
            if(predicate.test(value)){
                System.out.print(value+" ");
            }
        }
        System.out.println("");
    }
}
