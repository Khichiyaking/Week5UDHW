package week7Homework;

import java.util.Arrays;

//20. Write a Java program to sort a numeric array and a string array.
public class Qus20 {
    public static void main(String[] args) {

        int[] DV ={11,24,45,65,98,
                   34,22,14,67,44,
                   76,88,32,16,56,
                   22,03,55,66,99  };

        String[] VD = {"nissan", "toyota", "ford", "fiat","audi"};

        //Print the numeric array
        System.out.println("Numeric array :"+ Arrays.toString(DV));
        // Print the string array
        System.out.println("String array :" + Arrays.toString(VD));
    }
}
