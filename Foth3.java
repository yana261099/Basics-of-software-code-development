package THIRD;


import java.math.BigInteger;

public class Foth3 {
    public static void main(String[] args) {
        BigInteger s = new BigInteger("1");
        for (int i = 1; i < 201; i++)
            s = s.multiply(BigInteger.valueOf (i*i));
        System.out.println(s);
    }
}

//Столько цифр не вмещается ни в один тип данных