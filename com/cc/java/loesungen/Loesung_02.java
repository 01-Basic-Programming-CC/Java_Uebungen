package com.cc.java.loesungen;
/*
    Schreiben Sie ein Programm, welches den Namen und das Alter von dem User einliest und ausgibt.
        a.	Importieren Sie Scanner-Klasse: 
        	-	Diese Klasse ermöglicht es, Benutzereingaben zu erfassen.
        b.	Erstellen Sie in der Klasse eine main-Methode: 
            -	Die main-Methode, dient als Einstiegspunkt des Programms.
        c.	Erzeugen der Variablen: 
        	-	Verwenden Sie entsprechende Variablen, um den Namen und das Alter der Person zu speichern. 
        d.	Einlesen der Eingabe: 
        	-	Verwenden Sie Scanner, um den Namen und das Alter der Person einzulesen.
        e.	Ausgabe der Eingabe: 
        	-	Verwenden Sie System.out.println, um den Namen und das Alter auf dem Bildschirm anzuzeigen. 
*/

import java.util.Scanner;

public class Loesung_02
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String name = "";
		byte alter = 0;
		
		System.out.println("Bitte Namen eingben: ");
		name = sc.next();
		
		System.out.println("Bitte Aleter eingeben: ");
		alter = sc.nextByte();
		
		System.out.println("Name: " + name);
		System.out.println("Alter: " + alter);	
	}
}
