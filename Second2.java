package Second;

import com.jetbrains.Second;

import java.util.Scanner;

public class Second2 {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        int a = first.nextInt();
        int b = first.nextInt();
        int c = first.nextInt();
        int d = first.nextInt();
        int min1, min2, max;

        if (a > b)
            min1 = b;
        else min1 = a;

        if (c > d)
            min2 = d;
        else min2 = c;

        if (min1 > min2)
            max = min1;
        else max = min2;

        System.out.println(max);
    }
}