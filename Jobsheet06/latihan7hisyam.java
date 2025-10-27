package Jobsheet06;

import java.util.Scanner;

public class latihan7hisyam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double biayaPublikasi = 300000;
        double dekorasi = 500000;
        double komsumsiPanitia = 500000;
        double Hadiah = 4000000;
        double biayaoperasionalLain = 500000;
        double danaSponsor;
        double biayakonsumPeserta = 25000;
        double hononariumJuri = 75000;
        int jmlsetiapTim = 3;
        double biayasetiapTim = 50000;
        double danaPolinema = 0.6;
        int banyakTim;
        double danaTotal;
        double jumlahbantuandana = 0;
       

         System.out.print(" masukkan jumlah tim ");
        banyakTim= sc.nextInt();

       System.out.print("Apakah ada bantuan dari Polinema? (ya/tidak): ");
       String jawab = sc.next().toLowerCase();
       boolean bantuandaripoltek = jawab.equals("ya");

        if (bantuandaripoltek) {
            System.out.println("masukkan jumlah bantuan");
            jumlahbantuandana = sc.nextDouble();
            
        } else {
            System.out.println("yasudah gapapa:(");
        }
        
        //kalkulasi

        double totalKonsumsi = biayakonsumPeserta * jmlsetiapTim * banyakTim;
        double totalhononariumjuri = hononariumJuri * banyakTim;

        double biayaTetap = biayaPublikasi + dekorasi + komsumsiPanitia + Hadiah + biayaoperasionalLain + totalhononariumjuri + totalKonsumsi;
        danaTotal = (biayaTetap * danaPolinema) + (biayasetiapTim * banyakTim);
        danaSponsor = biayaTetap - danaTotal;
        double jikaditambahidana = danaSponsor + jumlahbantuandana;
        

        System.out.println("dana sponsor" + jikaditambahidana);
    }
}

    

