package com.jetbrains;

import java.util.Scanner;
import java.lang.Math;

public class Third {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        double x = first.nextInt();
        double y = first.nextInt();
        double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println(z);
    }
}