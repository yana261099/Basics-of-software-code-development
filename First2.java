package Second;

import com.jetbrains.Second;

import java.util.Scanner;

public class First2 {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        int ugol1 = first.nextInt();
        int ugol2 = first.nextInt();
        if (ugol1 + ugol2 > 178)
            System.out.println("Треугольник не существует");
        if (ugol1 + ugol2 == 90)
            System.out.println("Треугольник существует и он прямоугольный");
        if (ugol1 + ugol2 < 180 && ugol1 + ugol2 != 90)
            System.out.println("Треугольник существует и он не прямоугольный");
    }
}
