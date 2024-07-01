package com.telran.org.lessonfour;

import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("blue");
        String blue = scanner.nextLine();

        System.out.println("grey");
        String grey = scanner.nextLine();

         if (blue.length() % 2 != 0 || grey.length() % 2 != 0) {
             System.out.println("One of the words (or both of them) doesn't contain an even number of letters");
         } else {
        String bluePiece = blue.substring(0, blue.length() / 2);
        String greyPiece = grey.substring( grey.length() / 2);
        String newWord = bluePiece + greyPiece;

        System.out.println("The result: " + newWord);
          }

    }
}
