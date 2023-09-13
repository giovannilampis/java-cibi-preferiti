package org.lessons.java.array;

import java.util.Scanner;

public class CibiPreferiti {

	public static void main(String[] args) {
		
	      // Crea un oggetto Scanner per acquisire l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Richiedi all'utente il numero di elementi della classifica
        System.out.println("Inserisci il numero di elementi della classifica:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consuma il carattere di nuova linea rimasto nel buffer


        // Controlla che il numero di elementi sia compreso tra 5 e 10
        if (n < 5 || n > 10) {
            System.out.println("Il numero di elementi deve essere compreso tra 5 e 10");
            return;
        }

        // Inizializza l'array con la classifica dei cibi preferiti
        String[] cibi = new String[n];
        for (int i = 0; i < cibi.length; i++) {
            System.out.println("Inserisci il cibo preferito di posizione " + (i + 1) + ":");
            cibi[i] = scanner.nextLine();
        }

        // Stampa la lunghezza della classifica
        System.out.println("La classifica ha " + cibi.length + " elementi");

        // Stampa il cibo top
        System.out.println("Il cibo top è " + cibi[0]);

        // Stampa il cibo preferito ma non troppo
        System.out.println("Il cibo preferito ma non troppo è " + cibi[cibi.length - 1]);

        // Stampa il cibo di mezza classifica
        int mediana = cibi.length / 2;
        if (cibi.length % 2 == 0) {
            System.out.println("Il cibo di mezza classifica è " + (cibi[mediana - 1] + " e " + cibi[mediana]));
        } else {
            System.out.println("Il cibo di mezza classifica è " + cibi[mediana]);
        }
	}
}
