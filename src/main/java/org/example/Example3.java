package org.example;

public class Example3 {
    public static void main(String[] args) {
        int par = 3;
        int score = 7;

        if(par - score < -2 || par - score > 2)
            System.out.println("error");
        else
            System.out.println("golf_score(par,score,true)");
    }
}
