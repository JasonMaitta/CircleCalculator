import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a radius: ");
        double userRadius = scanner.nextDouble();

        System.out.println("Your diameter is " + diameter(userRadius));

        System.out.println("Your area is " + area(userRadius));

        System.out.println("Your circumference is "+ circumference(userRadius));

    }
    public static double diameter(double Radius) {
        return (Radius * 2);
    }
    public static double area(double Radius) {
        return (Radius * Radius * Math.PI);
    }
    public static double circumference(double Radius){
        return (2 * Math.PI * Radius);
    }

}