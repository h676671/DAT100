package oblig2;

import java.util.Scanner;

public class Oblig2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Skriv inn poengsummen: ");
        int poeng = scanner.nextInt();

        if (poeng < 0 || poeng > 100) {
            throw new IllegalArgumentException("Ugyldig poengsum");
        }

        if (poeng >= 90) {
            System.out.println("Karakter A med " + poeng + " poeng!");
        } else if (poeng >= 80) {
            System.out.println("Karakter B med " + poeng + " poeng!");
        } else if (poeng >= 60) {
            System.out.println("Karakter C med " + poeng + " poeng!");
        } else if (poeng >= 50) {
            System.out.println("Karakter D med " + poeng + " poeng!");
        } else if (poeng >= 40) {
            System.out.println("Karakter E med " + poeng + " poeng!");
        } else {
            System.out.println("Karakter F med " + poeng + " poeng!");
        }


    }

}






