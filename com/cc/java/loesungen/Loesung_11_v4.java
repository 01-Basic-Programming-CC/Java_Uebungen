package com.cc.java.loesungen;

import java.util.Scanner;

/*
	00.Taschenrechner Aufgabe:
		
	Bitte schreiben Sie ein kleines Taschenrechner Programm, welches von dem User 
	zuerst zwei zahlen einliest und im nächsten Schritt den User nach der Rechen Operation 
	fragt je nach Eingabe wird addiert / subtrahiert / multipliziert oder dividiert. 
	
	Das Ergebnis der Berechnung soll wie folgt ausgegeben werden: 5 + 7 = 12	
*/

public class Loesung_11_v4 
{
	public static void main(String[] args) 
	{
		double zahlEins = 0;
		double zahlZwei = 0;
		double ergebnis = 0;
		String oper = "";

		Scanner sc = new Scanner(System.in);
		
		do
		{
    		System.out.print("Zahl: ");
    		zahlEins = sc.nextInt();
    		
    		System.out.print("Zahl: ");
    		zahlZwei = sc.nextInt();
    		
    		System.out.println("Addition (+) - Subtraktion (-) - Multiplikation (*) - Divsion (:)");
    		System.out.print("Eingabe: ");
    		oper = sc.next();
    		
    		switch (oper)
    		{
    			case "+": 	ergebnis = zahlEins + zahlZwei;	break;
    			case "-": 	ergebnis = zahlEins - zahlZwei;	break;
    			case "*": 	ergebnis = zahlEins * zahlZwei;	break;
    			case ":": 	ergebnis = zahlEins / zahlZwei;	break;
    		}
    		
    		System.out.println(zahlEins  + " " + oper + " " + zahlZwei + " = " + ergebnis );
		}
		while(true);
	}
}
