package Jobsheet7;
import java.util.Scanner;

public class kafedowhile15 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int kopi,teh,roti;
         String namaPelanggann;
         int hargaKopi=12000,hargaTeh=7000,hargaRoti=20000;
         do{
         }while(true);
         do{
            System.out.println("masukkan nama pelanggan (ketik batal untuk keluar) ");
            namaPelanggann = sc.nextLine();
            if (namaPelanggann.equalsIgnoreCase("batal")){
                System.out.println("tranksaksi dibatalkan.");
                break;

                System.out.println("jumlahkopi:");
                kopi = sc.nextInt();
                System.out.println("Jumlah teh:");
                teh=sc.nextInt();
                System.out.println("jumlah roti:");
                roti = sc.nextInt();

                double totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) +(roti * hargaRoti);
                System.out.println("total yang harus dibayar: rp" + totalHarga);
                sc.nextLine();
            }while (true);
            System.out.println("semua 2");
        
            

            
        
         }
        

    }
}
 

