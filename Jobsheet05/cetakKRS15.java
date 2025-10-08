package Jobsheet05;
import java.util.Scanner;
public class cetakKRS15 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("apakah ukt udah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terferifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak,Silahkan lunasi UKT anda");
        }
    }
}