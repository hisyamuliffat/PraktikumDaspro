package Jobsheet10;
import java.util.Scanner;

public class biosopwithscanner14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String [][] penonton = new String [4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();

            
            while (true) {
                System.out.print("Masukkan baris (1-4): ");
                baris = sc.nextInt();

                if (baris >= 1 && baris <= 4) {
                    break; 
                } else {
                    System.out.println(" Nomor baris tidak tersedia! Silakan masukkan 1-4.");
                }
            }

            
            while (true) {
                System.out.print("Masukkan kolom (1-2): ");
                kolom = sc.nextInt();

                if (kolom >= 1 && kolom <= 2) {
                    break;  
                } else {
                    System.out.println(" Nomor kolom tidak tersedia! Silakan masukkan 1-2.");
                }
            }

            sc.nextLine(); 

            while (true) {
                if (penonton[baris-1][kolom-1] != null) {
                    System.out.println("Kursi sudah ditempati oleh: " + penonton[baris-1][kolom-1]);
                    System.out.print("Masukkan nomor kolom lain (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    
                    if (kolom < 1 || kolom > 2) {
                        System.out.println("Nomor kolom tidak tersedia!");
                        continue;
                    }
                } else {
                    
                    penonton[baris-1][kolom-1] = nama;
                    System.out.println("Kursi berhasil dipesan!");
                    break;
                }
            }
    

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

        
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print((penonton[i][j] == null ? "***" : penonton[i][j]) + " ");
            }
            System.out.println();
        }
    }
}

