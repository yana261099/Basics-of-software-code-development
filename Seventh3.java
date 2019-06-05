package THIRD;

import java.util.Scanner;

public class Seventh3 {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        System.out.println("Введите промежуток:");
        int m = first.nextInt();
        int n = first.nextInt();

        for (int i = m; i < n + 1; i++) {
            System.out.print("Делители числа " + i + ": ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
