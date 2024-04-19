package week7Homework;

import java.util.Scanner;

//13. Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
//find addition, Subtraction, multiplication and division according to theirsymbol(using if else)
public class Qus13 {
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
        int number1;
        int number2;
        float result;
        char Operator;

        System.out.println("Enter First Number.");
        number1 = game.nextInt();

        System.out.println("Enter an Operator(+,-,*,/):");
        Operator = game.next().charAt(0);

        System.out.println("Enter Second Number.");
        number2 = game.nextInt();

        if (Operator=='+')
        {result = number1 + number2;}
        else if (Operator == '-')
        {result = number1 - number2;}
        else if (Operator =='*')
        {result = number1 * number2;}
        else if (Operator == '/') {
            if (number2!= 0)
            {result = number1 / number2;}
            else{
                System.out.println("Error");}
            return;
        }
        else {
            System.out.println("Error: invalid Operator.");
            return;
        }
        System.out.println("Result:" +result);
    }
        {

        }
    }



