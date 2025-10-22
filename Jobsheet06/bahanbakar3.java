package Jobsheet06;

import java.util.Scanner;

public class bahanbakar3 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double biayasewaMobil = 300.000;
        double biayaSupir = 200.000;
        double biayabahanBakar = 1.000;

        System.out.print(" masukkan jarak tempuh ");
        double jarakTempuh = sc.nextDouble();
        System.out.print(" masukkan lama sewa ");
        int lamaSewa = sc.nextInt();
     if (lamaSewa <30) {
     }else{
         System.out.println("batas sewa maksimal 30");
        return;
       
    
        
            

        
     } 
        // Kalkulasi hehe semoga benar
        double totalbiayalamaSewa = (biayasewaMobil + biayaSupir) * lamaSewa;
        double totalbahanBakar = biayabahanBakar * jarakTempuh;
        // inilah output

        System.out.println(" total bahan bakar =" + totalbahanBakar);
        System.out.println("total biaya lama sewa = " + totalbiayalamaSewa);

    }

}


