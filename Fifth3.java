package THIRD;

import java.util.Scanner;
import java.lang.Math;


public class Fifth3 {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        System.out.println("Введите e: ");
        double e = first.nextDouble();

        double S = 0;

        for (int n = 1; n < 100; n++) {
            double an = (1/Math.pow(2, n))+(1/Math.pow(3, n));
            if (an > e)
                S += an;
        }

        System.out.println(S);
    }
}
