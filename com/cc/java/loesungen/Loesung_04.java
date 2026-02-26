package com.cc.java.loesungen;
/*
    Schreiben Sie ein Programm, welches zwei Zahlen von dem benutzter einliest, addiert und als Summe ausgibt.
    a.	Importieren Sie Scanner-Klasse: 
    	-	Diese Klasse ermöglicht es, Benutzereingaben zu erfassen.
    b.	Erstellen Sie in der Klasse eine main-Methode: 
    	-	Die main-Methode, dient als Einstiegspunkt des Programms.
    c.	Erzeugen der Variablen: 
    	-	Verwenden Sie entsprechende Variablen, um die erste Zahl, die zweite Zahl und das erggebnis zu speichern. 
    d.	Einlesen der Eingabe: 
    	-	Verwenden Sie Scanner, um die zwei Variablen einzulesen.
    e.	Addieren der Variablen: 
    	-	Verwenden Sie den „+ Operator“ um die Zahlen zu addieren. 
    f.	Ausgabe der Eingabe: 
    	-	Verwenden Sie System.out.println, um den Namen und das Alter auf dem Bildschirm anzuzeigen. 
*/

import java.util.Scanner;

public class Loesung_04
{
		public static void main(String[] args) 
		{
			int ersteZahl = 0, zweiteZahl = 0, ergebnis = 0;
			String eingabe = "";
			Scanner sc = new Scanner(System.in);	
			
			System.out.println("Bitte Zahl eingeben:");
			eingabe = sc.next();
			ersteZahl = Integer.parseInt(eingabe); 
			
			System.out.println("Bitte Zahl eingeben:");
			eingabe = sc.next();
			zweiteZahl = Integer.parseInt(eingabe);

			ergebnis =  ersteZahl + zweiteZahl;
				
			System.out.println("Ergebnis: " + ergebnis);	
		}
}
