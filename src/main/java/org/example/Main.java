package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("Vijay");
        a.add("Vinay");
        a.add("Vishal");
        System.out.println(a);

        System.out.println("New One");
        a.stream().filter(s -> s.startsWith("V")).forEach(System.out::println);
    }
}