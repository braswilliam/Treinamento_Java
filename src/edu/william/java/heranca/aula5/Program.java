package edu.william.java.heranca.aula5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.CANADA);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int qShapes = sc.nextInt();

        for (int i = 1; i <= qShapes ; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char alternative = sc.next().toLowerCase().charAt(0);



            if (alternative == 'r') {
                System.out.print("Color (BLACK/BLUE/RED): ");
                sc.nextLine();
                String color = sc.nextLine().toUpperCase();
                System.out.print("Width: ");
                double width  = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();

                list.add(new Rectangle(Color.valueOf(color), height, width ));



            } else {
                System.out.print("Color (BLACK/BLUE/RED): ");
                sc.nextLine();
                String color = sc.nextLine().toUpperCase();
                System.out.print("Radius: ");
                double radious = sc.nextDouble();

                list.add(new Circle(Color.valueOf(color), radious));

            }


        }


        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape shape : list) {
            System.out.printf("%.2f%n", shape.area());
        }

        sc.close();



    }


}
