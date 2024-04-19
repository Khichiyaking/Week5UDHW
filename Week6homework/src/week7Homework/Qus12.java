package week7Homework;

import java.util.Scanner;
//11. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
//other alphabet should be invalid entry.
//12. Same as above program-8 using switch statement.
//11. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
//other alphabet should be invalid entry.
public class Qus12 {
    public static void main(String[] args) {

        Scanner game = new Scanner(System.in);
        String  city = game.nextLine();
        System.out.println("Enter Starting Letter Between A to F:");

        switch (city){
            case  "A":
            System.out.println("Abu");
            break;
             case "B":
                System.out.println("Bombay");
                break;
            case "C":
                System.out.println("California");
                break;
            case "D":
                System.out.println("Dehradun");
            case "E":
                System.out.println("Egypt");
            case "F":
                System.out.println("France");
                break;
            default:
                System.out.println("INVALID ENTRY");
        }
    }
}
