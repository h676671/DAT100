package oblig3;

import java.util.Scanner;

public class Oblig3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Skriv inn n: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            throw new IllegalArgumentException("N er ugyldig.");
        }
        long fac = 1; //kan bruke int
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        System.out.println(n + "! = " + fac);

    }
}
