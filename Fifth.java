package com.jetbrains;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        int T = first.nextInt();

        int m = T / 60;
        int SS = T - m * 60;
        int HH = m / 60;
        int MM = m - HH * 60;

        System.out.println(HH + "ч " + MM + "мин " + SS + "с ");
    }



}
