package org.example;

public class Example4 {
    public static void main(String[] args) {
        int x = 5;
        System.out.print((true || (x/0)==1));

        x = 5;
        System.out.print((false && (x/0)==1));
    }
}
