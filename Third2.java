package Second;

import com.jetbrains.Second;

import java.util.Scanner;

public class Third2 {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        System.out.println("Введите координаты 1ой точки");
        int x1 = first.nextInt();
        int y1 = first.nextInt();
        System.out.println("Введите координаты 2ой точки");
        int x2 = first.nextInt();
        int y2 = first.nextInt();
        System.out.println("Введите координаты 3ей точки");
        int x3 = first.nextInt();
        int y3 = first.nextInt();

        int a = (y3 - y1) / (y2 - y1);
        int b = (x3 - x1) / (x2 - x1);

        if (a == b)
            System.out.println("Точки лежат на одной прямой");
    }
}