package week7Homework;
//14. Write a java program to print the numbers between 1 to 100 which can be divided by 3and
//5 separately.
public class Qus14 {
    public static void main(String[] args) {
        //Print numbers divided by 3
        System.out.println("\numberDivided by 3: ");
      for (int i =1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.println(i + ",");
        }
        //Print numbers divided by 5
        System.out.println("\numberDivided by 5:");
        for (int i =1; i < 100; i++ ) {
            if (i % 5 == 0)
                System.out.println(i +",");  }

        }
    }

