package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        
        String[] listaInvitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        Scanner input = new Scanner(System.in);

        System.out.println("Inserire il nome e premere invio");
        String nomeInput = input.nextLine();
        
        input.close();

        boolean trovato = false;
        for(int i = 0; i < listaInvitati.length; i++){

            if ( listaInvitati[i].equals(nomeInput) ) {
                System.out.println("Sei tra gli invitati!");
                trovato = true;
                break;
            }

        }

        if (!trovato) {
            System.err.println("Non sei tra gli invitati.");
        }
    }
}
