package no.hvl.dat100;
import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.*;

public class KarakterskalaC {



    public static void main(String[] args) {

        // Deklarasjon av variabler

        int karakterSkala[] = {0, 40, 50, 60, 80, 90};
        char bokstavKarakter[] = {'F', 'E', 'D', 'C', 'B', 'A'};
        char karakter = ' ';

        // les inn poengsumer 10 ganger
        for (int n = 1; n < 11; n++) {
            System.out.println("\nKarakter nr: " + n);

            String inntekt = showInputDialog("Oppgi poengsum for kandidat nr: " +n);
            int poengsum = parseInt(inntekt);

            if (poengsum >= 0 && poengsum <= 100) {
                // finn karakter
                for (int i = 0; i < 6; i++) {
                    if (poengsum >= karakterSkala[i]) {
                        karakter = bokstavKarakter[i];
                    }
                }
                // Utsktift
                System.out.println("Karakter: " + karakter + "  gis for poengsum = " + poengsum);
            } else {
                System.out.println(poengsum + " er en ugyldig poengsum");
            }
        }
    }
}
