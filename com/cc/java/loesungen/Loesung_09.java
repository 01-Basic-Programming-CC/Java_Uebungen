package com.cc.java.loesungen;
/*
   Bitte schreiben Sie ein Programm, welches die Temperatur umrechnet: 

    a.	Sie lesen vom User einen Grad Wert ein. 
    b.	Fragen Sie den User, ob er den Wert in Kelvin oder in Fahrenheit umrechnen will.
    c.	Im Anschluss geben Sie dem User den Umgerechnet Wert auf der Konsole aus. 

*/

import java.util.Scanner;

public class Loesung_09
{
	public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Grad Wert vom Benutzer einlesen
        System.out.println("Bitte geben Sie einen Grad Wert in Celsius ein:");
        double celsius = scanner.nextDouble();

        // Benutzer fragen, ob in Kelvin oder Fahrenheit umgerechnet werden soll
        System.out.println("Möchten Sie den Wert in Kelvin oder Fahrenheit umrechnen? (k/f):");
        char choice = scanner.next().toUpperCase().charAt(0);

        // Umrechnung und Ausgabe
        if (choice == 'K') 
        {
            double kelvin = celsius + 273.15;
            System.out.printf("Der Wert in Kelvin: %.2f K\n", kelvin);
            
        } else if (choice == 'F') 
        {
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.printf("Der Wert in Fahrenheit: %.2f °F\n", fahrenheit);
        } else 
        {
            System.out.println("Ungültige Auswahl. Bitte wählen Sie 'K' für Kelvin oder 'F' für Fahrenheit.");
        }
    }
}
