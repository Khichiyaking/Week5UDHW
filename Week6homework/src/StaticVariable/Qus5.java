package StaticVariable;
//Write a program for a calculator with addition, subtraction, multiplication, and division
//methods all with parameters and use string concatenation methods. (Note: Two static
//and Two instance methods.)
public class Qus5 {
    public static void main(String args[])
    {
        int add, subtract, multiply;
        float devide;

        int first = 15;
        int second = 5;

        add = first + second;
        subtract = first - second;
        multiply = first * second;
        devide = (float) first / second;

        System.out.println("Sum = " + add);
        System.out.println("Difference = " + subtract);
        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + devide);
    }
}
