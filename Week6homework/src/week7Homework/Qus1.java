package week7Homework;

import java.util.Scanner;
//Write a java program that tells us that Input number is odd or even? HINT: use ternary
//operator (? :)
public class Qus1 {
    public static void main(String[] args) {

        Scanner game =new Scanner(System.in);

        System.out.println("Enter number to test");

       int number=game.nextInt();

        //ternary operator to check number

        String result = number%2==0?"Even" : "Odd";
        System.out.println(number + "is" + result );

    }
}
