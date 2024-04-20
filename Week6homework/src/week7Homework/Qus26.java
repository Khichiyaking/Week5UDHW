package week7Homework;
//26. Write a Java program to reverse a word.
public class Qus26 {
    public static void main(String[] args) {

        String str= "Dhaval", kkt="";
        char ch;

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            kkt= ch+kkt; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ kkt);
    }
}
