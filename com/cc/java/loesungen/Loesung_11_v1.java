package com.cc.java.loesungen;
/*
	Bitte schreiben Sie ein kleines Taschenrechner Programm, welches von dem User zuerst zwei zahlen einliest
	und im nächsten Schritt den User nach der Rechen Operation fragt je nach Eingabe wird 
	addiert / subtrahiert / multipliziert oder dividiert. 
	
	Das Ergebnis der Berechnung soll wie folgt ausgegeben werden: 	5 + 7 = 12
*/

import java.util.Scanner;

public class Loesung_11_v1
{

	public static void main(String[] args)
	{
		int ersteZahl = 0, zweiteZahl = 0, ergebnis = 0;
		char operator = ' ' ;
		
		String eingabe = "", ausgabe = "";
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Bitte Zahl eingeben:");
		eingabe = sc.next();
		ersteZahl = Integer.parseInt(eingabe); 
		
		System.out.println("Bitte Zahl eingeben:");
		eingabe = sc.next();
		zweiteZahl = Integer.parseInt(eingabe);
		
		System.out.println("Bitte Operator eingeben:");
		eingabe = sc.next();
		
		operator = eingabe.charAt(0);
		
		switch (operator)
		{
		case '+':
			ergebnis = ersteZahl + zweiteZahl;
			break;
		case '-':
			ergebnis = ersteZahl - zweiteZahl;
			break;
		case '*':
			ergebnis = ersteZahl * zweiteZahl;
			break;
		case ':':
			ergebnis = ersteZahl / zweiteZahl;
			break;
		default:
			break;
		} 
		
		ausgabe = String.format("%s %s %s = %s", ersteZahl, operator, zweiteZahl, ergebnis)
			;
		System.out.println(ausgabe);
	}

}
