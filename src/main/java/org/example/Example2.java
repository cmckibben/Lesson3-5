package org.example;

public class Example2 {
    public static void main(String[] args) {
        int grade = 62;
        String lettergrade = "";
        if(grade >= 90) lettergrade += "A";
        else if (grade >=80 && grade <90) lettergrade += "B";
        else if (grade >=70 && grade <80) lettergrade += "C";
        else if (grade >=60 && grade <70) lettergrade += "D";
        else lettergrade += "E";

        System.out.println(lettergrade);
    }
}
