package com.cc.java.loesungen;
/*
    Schreiben Sie ein Programm, das eine Zahl vom Benutzer einliest und ausgibt, 
    ob die Zahl gerade oder ungerade ist.
    
*/

import java.util.Scanner;

public class Loesung_05
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie eine Zahl ein:");
        int zahl = scanner.nextInt();

        if (zahl % 2 == 0) 
        {
            System.out.println("Die Zahl " + zahl + " ist gerade.");
        }
        else 
        {
            System.out.println("Die Zahl " + zahl + " ist ungerade.");
        }

        scanner.close();
    }
}

