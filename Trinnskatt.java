package no.hvl.dat100;

import static java.lang.Math.*;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.*;


public class Trinnskatt {
    public static void main(String[] args) {

        // Deklarasjon av variabler
        double inntektsGrense[] = {
                217401.0,
                306051.0,
                697151.0,
                942401.0,
                1410751.0};
        double[] skattProsent = {1.7, 4.0, 13.7, 16.7, 17.7};
        double skatt = 0.0;
        double[] skatteTrinn = {0.0, 0.0, 0.0, 0.0, 0.0};

        // les inn brutto inntekt
        String inntekt = showInputDialog("Oppgi bruttoinntekt: ");
        double bruttoInntekt = parseDouble(inntekt);


        // jada!  Det skulle ha vært en løkke her,
        // men det er en '+1' feil ett sted... (så løkken kommer senere)

        // Trinn 1 skatt
        if ((bruttoInntekt > inntektsGrense[1]) ) {
            skatteTrinn[0] = (((inntektsGrense[1]) - (inntektsGrense[0]))* (skattProsent[0]/100));
        } else {
            skatteTrinn[0] = (bruttoInntekt - inntektsGrense[0]+1) * (skattProsent[0]/100);
        }

        // Trinn 2 skatt
        if ((bruttoInntekt > inntektsGrense[2]) ) {
            skatteTrinn[1] = (((inntektsGrense[2]) - (inntektsGrense[1]))* (skattProsent[1]/100));
        } else {
            skatteTrinn[1] = (bruttoInntekt - inntektsGrense[1]+1) * (skattProsent[1]/100);
        }

        // Trinn 3 skatt
        if ((bruttoInntekt > inntektsGrense[3]) ) {
            skatteTrinn[2] = (((inntektsGrense[3]) - (inntektsGrense[2]))* (skattProsent[2]/100));
        } else {
            skatteTrinn[2] = (bruttoInntekt - inntektsGrense[2]+1) * (skattProsent[2]/100);
        }

        // Trinn 4 skatt
        if ((bruttoInntekt > inntektsGrense[4]) ) {
            skatteTrinn[3] = (((inntektsGrense[4]) - (inntektsGrense[3]))* (skattProsent[3]/100));
        } else {
            skatteTrinn[3] = (bruttoInntekt - inntektsGrense[3]+1) * (skattProsent[3]/100);
        }

        // Trinn 5 skatt
        if ((bruttoInntekt - inntektsGrense[4]) >0) {
            skatteTrinn[4] = ((bruttoInntekt - (inntektsGrense[4]-1))* (skattProsent[4]/100));
        }


        // Summering av skatt
        for (int j = 0; j<5; j++) {
            if (skatteTrinn[j]>0) {     // Negative tall blir ignorert
                skatt += skatteTrinn[j];
            }
        }

        // Avrunding til to desimaler
        skatt = round((100*skatt));
        skatt /= 100;

        // Utskrift
        System.out.println("Brutto inntekt: "+ bruttoInntekt);
        System.out.println("Beregnet skatt: "+ skatt);

    }
}
