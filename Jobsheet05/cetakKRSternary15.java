package Jobsheet05;
import java.util.Scanner;

public class cetakKRSternary15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        
        String pernyataan = (uktLunas)
            ? "Pembayaran UKT terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA"
            : "Registrasi ditolak, silakan lunasi UKT Anda";

        System.out.println(pernyataan);
    }
}
