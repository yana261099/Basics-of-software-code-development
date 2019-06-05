package Second;

import com.jetbrains.Second;

import java.util.Scanner;

public class Foth2 {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        System.out.println("Задайте размеры отверстия");
        int A = first.nextInt();
        int B = first.nextInt();

        System.out.println("Задайте размеры кирпича");
        int x = first.nextInt();
        int y = first.nextInt();
        int z = first.nextInt();

        if (x < A || x < B) {
            if (y < B || z < B)
                System.out.println("Кирпич пройдет в отверстие");
            else System.out.println("Кирпич не пройдет в отверстие");
            return;
        }

        if (y < A || y < B) {
            if (x < B || z < B)
                System.out.println("Кирпич пройдет в отверстие");
            else System.out.println("Кирпич не пройдет в отверстие");
            return;
        }

        else System.out.println("Кирпич не пройдет в отверстие");

    }
}
