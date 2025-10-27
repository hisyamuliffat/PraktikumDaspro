package Jobsheet06;

import java.util.Scanner;
import java.lang.Math;

public class latihan9hisyam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int biayacetakperhalaman = 200;       
        double beratbookpaperperlembar = 3.0; 
        int beratkemasan = 300;                
        int ongkirperkg = 15000;    

        
        System.out.print("Masukkan jumlah halaman buku: ");
        int jumlahHalaman = sc.nextInt();
        sc.nextLine(); 

       
        System.out.print("Masukkan jenis cover (hard/soft): ");
        String jenisCover = sc.nextLine().toLowerCase();

        int hargaCover = 0;
        int beratCover = 0;

        if (jenisCover.equals("hard")) {
            hargaCover = 20000;
            beratCover = 250;
        } else if (jenisCover.equals("soft")) {
            hargaCover = 10000;
            beratCover = 100;
        } else {
            System.out.println("Jenis cover tidak valid! Harus 'hard' atau 'soft'.");
            return;
        }

      
        System.out.print("Masukkan kota tujuan pengiriman: ");
        String kota = sc.nextLine().toLowerCase();

      
        double jumlahLembar = Math.ceil(jumlahHalaman / 2.0);

       
        double beratKertas = jumlahLembar * beratbookpaperperlembar;
        double totalBeratGram = beratKertas + beratCover + beratkemasan;
        double totalBeratKg = totalBeratGram / 1000.0;

        
        int beratDibulatkan = (int) Math.ceil(totalBeratKg);

       
        int biayaCetak = jumlahHalaman * biayacetakperhalaman;

        
        int ongkir;
        if (kota.equalsIgnoreCase("malang") || kota.equalsIgnoreCase("batu")) {
            ongkir = 20000; 
        } else {
            ongkir = beratDibulatkan * ongkirperkg; 
        }

        
        int totalBiaya = biayaCetak + hargaCover + ongkir;

       
        System.out.println("\n===== RINCIAN PEMESANAN JBC =====");
        System.out.println("Jumlah halaman       : " + jumlahHalaman + " halaman");
        System.out.println("Jumlah lembar        : " + (int) jumlahLembar + " lembar");
        System.out.println("Jenis cover          : " + jenisCover + " cover");
        System.out.println("Kota tujuan          : " + kota.substring(0,1).toUpperCase() + kota.substring(1));
        System.out.println("Biaya cetak          : Rp " + biayaCetak);
        System.out.println("Harga cover          : Rp " + hargaCover);
        System.out.println("Ongkos kirim         : Rp " + ongkir);
        System.out.println("---------------------------------");
        System.out.println("TOTAL YANG HARUS DIBAYAR: Rp " + totalBiaya);
    }
}
