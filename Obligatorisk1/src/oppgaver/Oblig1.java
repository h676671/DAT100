package oblig1;

import java.util.Scanner;

public class Oblig1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Skriv inn bruttoinntekt: ");
        int brutto = scanner.nextInt();

        if (brutto < 0) {
            throw new IllegalArgumentException("Ugyldig inntekt");
        }

        if (brutto >= 934_051) {
            double skatt = brutto * 0.1452;
            System.out.println("Trinnskatten er: " + skatt);
        } else if (brutto >= 580_651) {
            double skatt = brutto * 0.1152;
            System.out.println("Trinnskatten er: " + skatt);
        } else if (brutto >= 230_951) {
            double skatt = brutto * 0.0241;
            System.out.println("Trinnskatten er: " + skatt);
        } else if (brutto >= 164_101) {
            double skatt = brutto * 0.0093;
            System.out.println("Trinnskatten er: " + skatt);
        } else {
            double skatt = brutto * 0;
            System.out.println("Trinn skatten er: " + skatt);
        }


    }
}
