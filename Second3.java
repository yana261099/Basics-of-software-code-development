package THIRD;

import java.util.Scanner;

public class Second3 {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        System.out.println("Введите промежуток: ");
        double a = first.nextDouble();
        double b = first.nextDouble();
        System.out.println("Введите шаг: ");
        double h = first.nextDouble();
        double y = 0;
        double x = 0;
        for ( x = a; x <= b; x += h) {
            System.out.print("При x = " + x + " ");
            if (x > 2)
                y = x;
            else y = -x;
            System.out.print("y = ");
            System.out.println(y);
        }

    }
}
