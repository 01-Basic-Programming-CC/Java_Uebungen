package com.cc.java.loesungen;
/*
    Bitte schreiben ein Programm, welches Kilogramm in Pfund umrechnet und umgekehrt: umrechnet: 

    a.	Lesen Sie vom User einen Wert ein. 
    b.	Fragen Sie den User, ob er den Wert in Pfund oder Kilogramm umrechnen möchte.
	c.	Im Anschluss geben Sie dem User den Umgerechneten Wert aus. 

*/

import java.util.Scanner;

public class Loesung_10
{
	public static void main(String[] args)
	{
	    Scanner scanner = new Scanner(System.in);
	
	    System.out.println("Bitte geben Sie einen Wert ein:");
	    double value = scanner.nextDouble();
	
	    System.out.println("Möchten Sie den Wert in Pfund oder Kilogramm umrechnen? (p/k):");
	    char choice = scanner.next().toUpperCase().charAt(0);
	
	    if (choice == 'P') 
	    {
	        double pounds = value * 2.20462;
	        System.out.printf("Der Wert in Pfund: %.2f lbs\n", pounds);    
	    } 
	    else if (choice == 'K') 
	    {
	        double kilograms = value / 2.20462;
	        System.out.printf("Der Wert in Kilogramm: %.2f kg\n", kilograms);
	    } 
	    else 
	    {
	        System.out.println("Ungültige Auswahl. Bitte wählen Sie 'P' für Pfund oder 'K' für Kilogramm.");
	    }
	}
}