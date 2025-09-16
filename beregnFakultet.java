package no.hvl.dat100;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Math.*;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.*;

public class beregnFakultet {

    public static void main(String[] args) {

        // Deklarasjon av variabler
        int nFak = 1;

        String innTekst = showInputDialog("Oppgi n fakultet: ");
        int n = parseInt(innTekst);

        for (int i = 1; i <= n; i++) {
            nFak = nFak * i;

        }
        System.out.println(n + "! = " + nFak);
    }
}
