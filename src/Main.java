import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("What shape would you like to calculate the area for? (circle, triangle, rectangle, or square)");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next().toLowerCase();
        if (userInput.equals("circle")) {
            System.out.println("please enter the radius: ");
            double r = sc.nextDouble();
            circle(r);
        } else if (userInput.equals("triangle")) {
            System.out.println("please enter the base: ");
            double b = sc.nextDouble();
            System.out.println("please enter the height: ");
            double h = sc.nextDouble();
            triangle(b, h);
        } else if (userInput.equals("rectangle")) {
            System.out.println("please enter the length: ");
            double l = sc.nextDouble();
            System.out.println("please enter the width: ");
            double w = sc.nextDouble();
            rectangle(l, w);
        } else if (userInput.equals("square")) {
            System.out.println("please enter the length: ");
            double le = sc.nextDouble();
            square(le);
        }
    }
    public static double circle (double r){
        double π =3.14;
        double area =  π*r*r;
        System.out.println("The area of the shape is: "+area);
        return area;
    }
    public static double triangle (double b, double h) {
        double area = 0.5 * b * h;
        System.out.println("The area of the shape is: "+area);
        return area;
    }
    public static double rectangle (double l, double w) {
        double area = l*w;
        System.out.println("The area of the shape is: "+area);
        return area;
    }
    public static double square (double le) {
        double area = le*le;
        System.out.println("The area of the shape is: "+area);
        return area;
    }
}





