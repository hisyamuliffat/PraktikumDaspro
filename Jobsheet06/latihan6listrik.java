package Jobsheet06;

import java.util.Scanner;

public class latihan6listrik {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bebanbiayaPerbulan = 50.000;
       
        double pPn = 0.1;
        String jenisdaya;
        
        double biayayangharusDibayar;
        double totalbiayayangharusdiBayar;
        double totalbiayasetelahpajak;
        double dayaA,dayaB,dayaC;
        double hargadaya = 0;
        double diskon = 0.05;


        
        
        
        System.out.print(" masukkan jenis daya =");
        jenisdaya = sc.nextLine().toLowerCase();
        dayaA = 1300;
        dayaB= 1500;
        dayaC = 1700;
         

    switch (jenisdaya) {
        case "900va":
           hargadaya = dayaA;
           break;
        case "1300va":
           hargadaya = dayaB;
           break;
        case "2200va":
        hargadaya = dayaB;
        break;
        case "3500va":
           hargadaya = dayaC;
        break;
        case "5500va":
        hargadaya = dayaC;
        break;

        default:
        System.out.println("Jenis VA tidak ada di menu");
            return;
    }

    System.out.println("masukkan kwh");
        double kwh = sc.nextDouble();
      if (kwh <80) {
      }else{
        System.out.println("Maaf batas kwh sampai 80 saja");
        return;
        
      }

        

      
        
                
        
        totalbiayayangharusdiBayar = bebanbiayaPerbulan + kwh * hargadaya;
        if (totalbiayayangharusdiBayar >2000000 * diskon) {
            
            
        }

        totalbiayasetelahpajak = totalbiayayangharusdiBayar * pPn;
        biayayangharusDibayar = totalbiayayangharusdiBayar + totalbiayasetelahpajak;
         
        System.out.println("biaya yang harus dibayarkan oleh pelanggan berdasarkan daya listrik=" + biayayangharusDibayar);
}

}

    

