package THIRD;

import java.util.ArrayList;
import java.util.Scanner;

public class Eighth3 {

    public static void main(String[] args) {
        System.out.println("Введите два числа:");
        Scanner first = new Scanner(System.in);


        int[] myArray; // объявление массива
        myArray = new int[10];

        int a = first.nextInt();
        int b = first.nextInt();
        int o = 0;
        for (int i = a; i >= 1; i = i/10) {
            for (int j = b; j >= 1; j = j / 10) {
                if (i % 10 == j % 10) {
                    int k = 0;
                    for (int x = 0; x < 10; x++) {
                        if (i % 10 == myArray[x])
                            return;
                        else k++;
                    }
                    if (k == 10) {
                        myArray[o] = i % 10;
                        o++;
                    }
                }
            }
        }
        int p;
        for (p = 0; p < o; p++) {
            System.out.println(myArray[p]);
        }
    }

}
