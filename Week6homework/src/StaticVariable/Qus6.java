package StaticVariable;
//6. Write a program to enter any radius value of the circle and find out the area. (Formula
//of Area A=PI*r*r).
public class Qus6 {
    public static double radius = 9.5;

    public static void main(String[] args) {
        //calculate the perimeter of the circle using the radius
        double perimeter =2 * Math.PI * radius;

        // Calculate the area of the circle using the constant radius

        double area = Math.PI * radius * radius;

        // Print the calculated perimeter and area

        System.out.println("Perimeter is=" + perimeter);
        System.out.println("Area is =" + area);

    }
}
