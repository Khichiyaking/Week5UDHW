package NewInstanceVariables;

import java.sql.SQLOutput;

public class Week6Qus13 {
    // 1.3 Call both instance variables into the instance method inside the print statement.
    String name = "Divyam";
    String name1 = "Patel";

    public static void main(String[] args) {
        Week6Qus13 a = new Week6Qus13();
    a.n1();
        System.out.println(a.name);
        System.out.println(a.name1);
    }

    public void n1() {
        String course = "Divs";

        System.out.println(course);
        System.out.println(name);
        System.out.println(name1);

    }

}
