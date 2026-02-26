package com.cc.java.loesungen;

import java.util.Scanner;

/*
   Lesen Sie zwei Zahlen vom Benutzer ein, vergleichen Sie diese und geben Sie die Größere von beiden aus.
    a.	Importieren Sie Scanner-Klasse: 
    	-	Diese Klasse ermöglicht es, Benutzereingaben zu erfassen.
    b.	Erstellen Sie in der Klasse eine main-Methode: 
    	-	Die main-Methode, dient als Einstiegspunkt des Programms.
    c.	Erzeugen der Variablen: 
    	-	Verwenden Sie entsprechende Variablen, um die erste Zahl und eine zweite Zahl zu speichern. 
    d.	Einlesen der Eingabe: 
    	-	Verwenden Sie Scanner, um die zwei Variablen einzulesen.
    e.	Vergleichen der Variablen: 
    	-	Verwenden eine if bzw. eine if-else um den vergleich auszuführen. 
    f.	Ausgabe der Eingabe: 
    	-	Verwenden Sie System.out.println, um die größere von beiden auszugeben. 
*/

public class Loesung_03
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int zahlEins;
		zahlEins = 0;
		
		System.out.print("ZahlEins eingeben: ");
		zahlEins = sc.nextInt();
		
		int zahlZwei;
		zahlZwei = 0;
		
		System.out.print("ZahlZwei eingeben: ");
		zahlZwei = sc.nextInt();
		
		if (zahlEins > zahlZwei)
		{
			System.out.println("zahlEins ist groesser");
		}
		else if(zahlEins < zahlZwei )
		{
			System.out.println("zahlZwei ist groesser");
		}
		else
		{
			System.out.println("beide zahlen sind gleich");
		}
	}
}
