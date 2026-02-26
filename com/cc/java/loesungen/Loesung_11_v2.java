package com.cc.java.loesungen;

import java.util.Scanner;

/*
	00.Taschenrechner Aufgabe:
		
	Bitte schreiben Sie ein kleines Taschenrechner Programm, welches von dem User 
	zuerst zwei zahlen einliest und im nächsten Schritt den User nach der Rechen Operation 
	fragt je nach Eingabe wird addiert / subtrahiert / multipliziert oder dividiert. 
	
	Das Ergebnis der Berechnung soll wie folgt ausgegeben werden: 5 + 7 = 12	
*/

public class Loesung_11_v2 
{
	public static void main(String[] args) 
	{
		double zahlEins = 0;
		double zahlZwei = 0;
		double ergebnis = 0;
		int oper = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Bitte geben Sie eine Zahl ein: ");
		zahlEins = sc.nextInt();
		
		System.out.print("Bitte geben Sie eine Zahl ein: ");
		zahlZwei = sc.nextInt();
		
		System.out.println("Welche Berechnung wollen Sie mit den Zahlen durchfuehren?");
		System.out.println("Addition (1) - Subtraktion (2) - Multiplikation(3) - Divsion (4)");
		System.out.print("Eingabe: ");
		oper = sc.nextInt();
		
		if (oper == 1)
		{
			ergebnis = zahlEins + zahlZwei;
			System.out.println(zahlEins  + " + " + zahlZwei + " = " + ergebnis );
		}	
		if (oper == 2)
		{
			ergebnis = zahlEins - zahlZwei;
			System.out.println(zahlEins  + " - " + zahlZwei + " = " + ergebnis );
		}		
		if (oper == 3)
		{
			ergebnis = zahlEins * zahlZwei;
			System.out.println(zahlEins  + " * " + zahlZwei + " = " + ergebnis );
		}		
		if (oper == 4)
		{
			ergebnis = zahlEins / zahlZwei;
			System.out.println(zahlEins  + " : " + zahlZwei + " = " + ergebnis );
		}		
	}
}
