package StaticVariable;
//2.3 Call both static variables into the static method inside the print statement.
public class WeekQue23 {

    static String name = "Divyam";
    static String name1 = "Patel";

    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(name1);
        WeekQue23 v = new WeekQue23();
        v.m1();
    }
    public void m1(){
        String course = "Dhaval";
        System.out.println(course);
        System.out.println(name);
        System.out.println(name1);
    }
}
