package com.cc.java.loesungen;

import java.util.Scanner;

/*
	Schreiben Sie ein Programm, das das Alter eines Benutzers einliest und ausgibt, 
	ob die Person ein Kind, Jugendlicher oder Erwachsener ist. 
*/

public class Loesung_06
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie Ihr Alter ein: ");
        int alter = scanner.nextInt();

        if (alter < 13) 
        {
            System.out.println("Sie sind ein Kind.");
            
        } 
        else if (alter >= 13 && alter < 18) 
        {
            System.out.println("Sie sind ein Jugendlicher.");
        } 
        else 
        {
            System.out.println("Sie sind ein Erwachsener.");
        }

        scanner.close();
    }
}
