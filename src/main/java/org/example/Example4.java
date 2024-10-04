package org.example;

public class Example4 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println((true || (x/0)==1));

        System.out.println((false && (x/0)==1));
    }
}
