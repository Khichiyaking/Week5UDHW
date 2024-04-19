package week7Homework;

import java.util.Scanner;

//15. Write a program that tells us input value is number or an alphabet orsymbol.
public class Qus15 {
    public static void main(String[] args) {
        sub();
    }
    public static void sub(){
        Scanner dv = new Scanner(System.in);
        System.out.println("Enter char any number or alphabet or symbol");
        char dd = dv.next().charAt(0);

        if ((dd >= 'a' && dd <= 'z')) {
            System.out.println("is A Alphabet");

        } else if ((dd >= '0' && dd <= '9')) {
            System.out.println("is A Digit");
        }
    else {
            System.out.println("is A Symbol");
        }
    }
}
