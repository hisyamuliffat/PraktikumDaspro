package Jobsheet06;
import java.util.Scanner;

public class latihan05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bebanbiayaPerbulan = 50.000;
        double tariflistrikPerkwh = 0;
        double pPn = 0.1;
        
        double biayayangharusDibayar;
        double totalbiayayangharusdiBayar;
        double totalbiayasetelahpajak;
        
        
        
        System.out.print(" masukkan daya");
        int daya = sc.nextInt();

         if (daya == 900) {
            tariflistrikPerkwh = 1300;
        } else if (daya == 1300 || daya == 2200) {
            tariflistrikPerkwh = 1500;
        } else if (daya == 3500 || daya == 5500) {
            tariflistrikPerkwh = 1700;
        } else {
            System.out.println("Daya tidak dikenal! Gunakan salah satu dari 900, 1300, 2200, 3500, atau 5500 VA.");
            return;
        }

        System.out.println("masukkan kwh");
        double kwh = sc.nextDouble();
        
                
        
                totalbiayayangharusdiBayar = bebanbiayaPerbulan + tariflistrikPerkwh * daya;

        totalbiayasetelahpajak = totalbiayayangharusdiBayar * pPn;
        biayayangharusDibayar = totalbiayayangharusdiBayar + totalbiayasetelahpajak;
         
        System.out.println("biaya yang harus dibayarkan oleh pelanggan berdasarkan daya listrik=" + biayayangharusDibayar);
}

}


