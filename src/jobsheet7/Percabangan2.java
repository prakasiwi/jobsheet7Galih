/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;

import java.util.Scanner;

/**
 *
 * @author galih
 */
public class Percabangan2 {
    public static void main(String[] args) {
        String identitas = "Mochammad Galih Prakasiwi / X RPL 5 / 22";
        System.out.println("identitas : "+ identitas);
        
        System.out.print("\nSaran Resep dari Bahan Milik Anda\n");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bahan Prtama: ");
        System.out.println("1. Pisang ");
        System.out.println("2. Telur ");
        System.out.print("Masukkan no pilihan Anda :");
        int bahan1 = scanner.nextInt();
        
    }
    
}
