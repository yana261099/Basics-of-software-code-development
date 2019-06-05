package com.jetbrains;

import java.util.Scanner;
import java.lang.Math;

public class Second {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        double a = first.nextDouble();
        double b = first.nextDouble();
        double c = first.nextDouble();
        double y = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - (Math.pow(a, 3) * c) + (Math.pow(b, -2));
        System.out.println(y);

    }
}
