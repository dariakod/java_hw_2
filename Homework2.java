package com.telran.org.lessonfour;

public class Homework2 {

    public static void main(String[] args) {
        String firstString = "I study Basic Java";

        System.out.println(firstString.charAt(firstString.length() -1 ));

       if  (firstString.contains("Java")) {
           System.out.println("My string contain a substring 'Java'.");
       } else {
           System.out.println("My string does not contain a substring 'Java'.");
       }


        String upward = firstString.toUpperCase();
        System.out.println(upward);

        String lower = firstString.toLowerCase();
        System.out.println(lower);

        String substring = firstString.substring();
        System.out.println(substring);

    }
}
