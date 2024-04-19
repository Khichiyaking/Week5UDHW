package week7Homework;
//2. Declare array and store any 5 countries and print them in console.
public class Qus2 {
    public static void main(String[] args) {

        String[] country ={"India", "Dubai", "London","Srilanka","Paris"};

        System.out.println(country[3]);
        System.out.println(country.length);
        for (int i=0; i < country.length; i++){
            System.out.println(country[i]);
        }


    }

}
