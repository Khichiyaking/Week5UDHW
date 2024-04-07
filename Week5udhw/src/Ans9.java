public class Ans9 {
    //Write a Java program to print the result of the following operations.
    //Test Data: a. -5 + 8 * 6
     // b. (55+9) % 9
    //c. 20 + -3*5 / 8
    //d. 5 + 15 / 3 * 2 - 8 % 3

    //Expected Output : 43
            //1
            //19
           // 13
    public static void main(String[] args) {

        int a = -5; //Declare int datatype and variable name as a
        int b = 8; //Declare int datatype and variable name as b
        int c = 6; //Declare int datatype and variable name as c
        int d = 55; //Declare int datatype and variable name as d
        int e = 9; //Declare int datatype and variable name as e
        int f = 20; //Declare int datatype and variable name as f
        int g = -3; //Declare int datatype and variable name as g
        int h = 5; //Declare int datatype and variable name as h
        int i = 15; //Declare int datatype and variable name as i
        int j = 3; //Declare int datatype and variable name as j
        int k = 2; //Declare int datatype and variable name as k

        //Declare print statement
        System.out.println(a + b * c);
        System.out.println((d+e) % e);
        System.out.println(f + g * h /b);
        System.out.println(h + i / j * k - b % j);

    }
}
