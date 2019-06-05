package com.jetbrains;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        System.out.println("Задайте координаты точки");
        int x = first.nextInt();
        int y = first.nextInt();

        if (x >= -2 && x <= 2 && y >= 0 && y <= 4) {
            System.out.println("true");
            return;
        }

        if (x >= -4 && x <= 4 && y >= -3 && y <= 0)
            System.out.println("true");
        else System.out.println("false");
    }
}
