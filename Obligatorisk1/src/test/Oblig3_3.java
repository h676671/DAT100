package oblig3;

import java.math.BigInteger;
import java.util.Scanner;

public class Oblig3_3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Skriv inn n: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            throw new IllegalArgumentException("N er ugyldig.");
        }
        BigInteger fac = new BigInteger("1"); //kan bruke int
        for (int i = 1; i <= n; i++) {
            fac = fac.multiply(new BigInteger(""+i));
        }
        System.out.println(n + "! = " + fac);

    }
}