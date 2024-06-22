package org.example.java8.features.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsTest {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

       productsList.stream().map(p -> p.getPrice()).collect(Collectors.toList())
               .forEach(System.out::println);
    }
}
