package com.jetbrains;

import java.util.Scanner;

public class Foth {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner first = new Scanner(System.in);
        double R = first.nextDouble();
        double R0 = R*1000;
        int d =(int)  R0 % 10;
        int n = (int) R0 / 100000;
        double R2 = d*100 + d*10 + d + n*0.1 + n*0.01 + n*0.001;
        System.out.println(R2);
    }
}
