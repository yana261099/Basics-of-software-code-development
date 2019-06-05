package THIRD;

import java.util.Scanner;

public class First3 {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        int a = first.nextInt();
        int S = 0;

        for (int i = 1; i < a+1; i++)
            S = S + i;

        System.out.println(S);
    }
}
