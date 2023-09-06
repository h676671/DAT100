package oblig3;

import java.util.Scanner;

public class Oblig3_2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) {
            throw new IllegalArgumentException("N er ugyldig.");
        }
        int fac = 1;
        int i = 1;
        do  { 
            fac = fac * i;
            i++;
        } while(i<=n);

        
        System.out.println(n + "! = " + fac);

    }
}
