package week7Homework;

import java.util.Scanner;
//19.Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”
public class Qus19 {
    public static void main(String[] args) {
        Scanner dv = new Scanner(System.in);
        System.out.println("Input a number");
        int vv = dv.nextInt();
        if (vv > 0) {
            System.out.println("Number is positive");}
        else if (vv < 0) {
            System.out.println("Number is negative");}
            else {
            System.out.println("Number is Zero");
        }
    }
}
