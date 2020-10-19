package Shape;

import Shape.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.println("Enter the number of shape: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i ++){
            System.out.println("==== Shape #" + i + " data: ====");
            System.out.print("Rectangle or Circle? (r/c) ");
            char ch = sc.next().charAt(0);
            System.out.print("Color: (BLUE / RED / ORANGE / YELLOW / GREEN) ");
            Color color = Color.valueOf(sc.next());

            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Heigth: ");
                double heigth = sc.nextDouble();
                list.add(new Rectangle(color,width,heigth));
            } else {
                System.out.print("Radius");
                double radius = sc.nextDouble();
                list.add(new Circle(color,radius));
            }
        }
        System.out.println("SHAPE AREAS: ");
        for (Shape shape:list) {
            System.out.println(String.format("%.2f",shape.area()));

        }
    }
}
