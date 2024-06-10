package org.example.java8.features.functionInterfaces.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Test {
    public static void main(String... args) {
        List<Student> list = new ArrayList<>();
        populate(list);
        Function<Student,String> function=(student)->{
            Integer i=student.getMarks();
            if(i<=100 && i>85)
                return "First Class";
            else if(i<85 && i>70)
                return "SecondClass";
            else
                return "PASS";
        };

        for (Student student: list){
            System.out.println(student.getName()+" "+ function.apply(student));

        }
    }

    private static void populate(List<Student> l) {
        l.add(new Student("Sunny", 100));
        l.add(new Student("Bunny", 65));
        l.add(new Student("Chinny", 55));
        l.add(new Student("Vinny", 45));
        l.add(new Student("Pinny", 25));
    }
}
