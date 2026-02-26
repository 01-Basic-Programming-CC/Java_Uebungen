package com.cc.java.loesungen;

import java.util.Scanner;

/*
   Bitte schreiben Sie ein Programm, welches von dem User die folgenden Informationen abfragt:
        - Vorname Nachname
        - Straße 
        - Hausnummer
        - PLZ
        - Ort

	Geben Sie die Daten wie folgt aus:
	Vorname:	 		Peter 
	Nachname:			Mueller
	Adresse:
						Hauptstraße 1
						51107 Köln 
*/

public class Loesung_12
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie Ihren Vornamen ein: ");
        String vorname = scanner.nextLine();

        System.out.print("Bitte geben Sie Ihren Nachnamen ein: ");
        String nachname = scanner.nextLine();

        System.out.print("Bitte geben Sie Ihre Straße ein: ");
        String strasse = scanner.nextLine();

        System.out.print("Bitte geben Sie Ihre Hausnummer ein: ");
        String hausnummer = scanner.nextLine();

        System.out.print("Bitte geben Sie Ihre PLZ ein: ");
        String plz = scanner.nextLine();

        System.out.print("Bitte geben Sie Ihren Ort ein: ");
        String ort = scanner.nextLine();

        System.out.println("\nVorname:\t\t" + vorname);
        System.out.println("Nachname:\t\t" + nachname);
        System.out.println("Adresse:");
        System.out.println("\t\t\t" + strasse + " " + hausnummer);
        System.out.println("\t\t\t" + plz + " " + ort);

        scanner.close();
    }
}