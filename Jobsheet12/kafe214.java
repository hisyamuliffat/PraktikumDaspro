package Jobsheet12;
import java.util.Scanner;


public class kafe214 {
    
     
   

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        Scanner sc = new Scanner(System.in);
        String kodePromo;
         System.out.print("masukkan kode diskon:");
        kodePromo = sc.nextLine();
        

        if (kodePromo.equals("DISKON50")){
            System.out.println("Anda mendapatkan diskon 50%");
        }else if(kodePromo.equals("DISKON30")){
            System.out.println("Anda mendapatkan diskon 30%");
        }else{
            System.out.println("Kode Invalid");
        }


        

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");

        }
       


         
        

        System.out.println("====== MENU RESTO KAFE====");
        System.out.println("1. kopi hitam - Rp 15.000");
        System.out.println("2. cappucino - Rp 20.000");
        System.out.println("3. latte - Rp 22.000");
        System.out.println("4. teh tarik - Rp 12.000");
        System.out.println("5. roti bakar - Rp 10.000");
        System.out.println("6. mie goreng - Rp 18.000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang anda inginkan");
    }

    public static void main(String[] args) {
       
        Menu("Andi", true);

         


    
    }
}
