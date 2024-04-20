package week7Homework;

import javax.naming.Name;
import java.util.Scanner;

public class Qus5 {
    static int Maths, Science, English, Total;
    static float per;
    static String Result, Grade;

    public static void main(String[] args) {
        mark();
    }

    public static void mark() {
        Scanner np = new Scanner(System.in);

        System.out.println("Enter Student name");
        String name = np.next();

        System.out.println("Enter Roll Number");
        int rollno = np.nextInt();

        System.out.println("Enter Maths Subject Marks: ");
        Maths = np.nextInt();

        if (Maths >= 0 && Maths <= 100) {
            System.out.println("Enter Science Subject Marks: ");
            Science = np.nextInt();

            System.out.println("Enter English Subject Marks: ");
            English = np.nextInt();
        } else {
            System.out.println("Please Enter Marks Between 0 and 100");
        }
        Total = Maths + Science + English;
        per = Total / 3;
        if (per >= 35) {
            Grade = "pass";
            if (per >= 80) {
                Grade = "A+";
            } else if (per >= 60 && per < 80) {
                Grade = "A+";
            } else if (per >= 50 && per < 60) {
                Grade = "B";
            } else if (per >= 35 && per < 50) {
                Grade = "C";
            } else {
                Result = "Fail";
            }
            System.out.println("......................................");
            System.out.println("|                                      |");
            System.out.println("|             Mark Sheet               |");
            System.out.println("|-------                               |");
            System.out.println("|            :   " + name + "              |");
            System.out.println("|            :   " + rollno + "            |");
            System.out.println("|______________________________________|");
            System.out.println("|   Subject  :      Marks              |");
            System.out.println("|______________________________________|");
            System.out.println("|    Maths    :       " + Maths + "         |");
            System.out.println("|    Science  :       " + Science + "       |");
            System.out.println("|    English  :       " + English + "       |");
            System.out.println("|_______________________________________|");
            System.out.println("|    Total    :     " + Total + "           |");
            System.out.println("|_______________________________________|");
            System.out.println("|  Percentage  :     " + per + "            |");
            System.out.println("|  Result      :     " + Result + "         |");
            System.out.println("|  Grade       :      " + Grade + "         |");
            System.out.println("|_______________________________________|");
        }
    }
}


