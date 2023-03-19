import shape.shape;

import java.util.ArrayList;
import java.util.Scanner;
public class Main implements shape {
        final double pi = 3.14;
    @Override
    public void circle(double r) {
        double area = pi * r * r;
        System.out.println("Area of circle with radius " + r + " is: " + area);
    }

    @Override
    public void rectangle(double length, double width) {
        double area = length * width;
        System.out.println("Area of rectangle is: " + area);
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter 1 for circle or 2 for rectangle:");
        int choice = x.nextInt();
        Main obj = new Main();

        if (choice == 1) {
            ArrayList<Double> radiusList = new ArrayList<>();
            System.out.println("Enter radius values (enter 00 to stop):");
            while (true) {
                double radius = x.nextDouble();
                if (radius == 00) {
                    break;
                }
                radiusList.add(radius);
            }
            for (double radius : radiusList) {
                obj.circle(radius);
            }
        } else if (choice == 2) {
            System.out.println("Enter length and width:");
            double length = x.nextDouble();
            double width = x.nextDouble();
            obj.rectangle(length, width);
        } else {
            System.out.println("Invalid choice");
        }



    }}
