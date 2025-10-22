package Jobsheet06;

import java.util.Scanner;

public class bahanbakar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double biayasewaMobil = 300.000;
        double biayaSupir = 200.000;
        double biayabahanBakar = 0;
        double hargaPertalite = 13000;
        double hagaPertamax = 10000;
        double ppn = 0.5;

        System.out.println("masukkan jenis bahan bakar");
        String jenisBbm = sc.nextLine().toLowerCase();

        switch (jenisBbm) {
            case "pertalite":
                biayabahanBakar = hargaPertalite;
            case "pertamax":
                biayabahanBakar = hagaPertamax;

                break;

            default:
                System.out.println("menu tidak ada");
        }

        System.out.print(" masukkan lama sewa ");
        int lamaSewa = sc.nextInt();

        System.out.print(" masukkan jarak tempuh ");
        double jarakTempuh = sc.nextDouble();
        // Kalkulasi hehe semoga benar
        double totalbiayalamaSewa = (biayasewaMobil + biayaSupir) * lamaSewa;
        double totalbahanBakar = biayabahanBakar * jarakTempuh;
        double totalKeseluruhan = totalbiayalamaSewa + totalbahanBakar;
        if (totalKeseluruhan >2000000 *ppn) {
            
        }
   

        // inilah output

        System.out.println(" total bahan bakar =" + totalbahanBakar);
        System.out.println("total biaya lama sewa =" + totalbiayalamaSewa);
        System.out.println("total keseluruhan =" + totalKeseluruhan);


    }

}

    
