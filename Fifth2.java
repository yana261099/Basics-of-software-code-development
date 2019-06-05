package Second;

import com.jetbrains.Second;

import java.util.Scanner;

public class Fifth2 {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        int x = first.nextInt();
        double a, b;

        if (x > 3) {
            a = 1 / (Math.pow(x, 3) + 6);
            System.out.println(a);
        }
        else {
            b = Math.pow(x, 2) - 3 * x + 9;
            System.out.println(b);
        }
    }
}
