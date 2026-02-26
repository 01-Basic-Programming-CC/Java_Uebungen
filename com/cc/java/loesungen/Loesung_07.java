package com.cc.java.loesungen;

import java.util.Scanner;

/*
   	Schreiben Sie ein Programm, das den Benutzer nach seiner Kraft auf einer Skala von 1 bis 10 fragt und ausgibt, 
   	ob er schwach, mittelstark oder stark ist. 
*/

public class Loesung_07
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte bewerten Sie Ihre Kraft auf einer Skala von 1 bis 10: ");
    
        int kraft = scanner.nextInt();

        if (kraft >= 1 && kraft <= 3) 
        {
            System.out.println("Sie sind schwach.");
        } 
        else if (kraft >= 4 && kraft <= 7) 
        {
            System.out.println("Sie sind mittelstark.");
        } 
        else if (kraft >= 8 && kraft <= 10) 
        {
            System.out.println("Sie sind stark.");
        }
        else
        {
            System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl zwischen 1 und 10 ein.");
        }

        scanner.close();
    }
}