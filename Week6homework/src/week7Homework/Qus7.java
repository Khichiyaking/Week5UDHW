package week7Homework;

import java.util.Scanner;

//7. Write a java program to input any number and find out if it’s odd or even.
public class Qus7 {

    public static void main(String[] args) {

        Scanner Game= new Scanner(System.in);
        System.out.println("Enter a number");
        int number= Game.nextInt();
        if (number % 2 ==0)
        System.out.println(number + "is even");
        else
            System.out.println(number + "is odd");
    }
}
