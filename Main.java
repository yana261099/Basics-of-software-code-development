package com.jetbrains;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        int a = first.nextInt();
        int b = first.nextInt();
        int c = first.nextInt();
        System.out.println(a + " " + b + " " + c);
        int z = ((a-3)*b/2)+c;
        System.out.println(z);
    }
}

