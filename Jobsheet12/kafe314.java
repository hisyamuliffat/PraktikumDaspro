package Jobsheet12;

import java.util.Scanner;

public class kafe314 {

    public static int hitungTotalHarga14(int pilihanMenu, int banyakItem){
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargatotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargatotal;
    }

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

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
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Andi", true);

        int totalKeseluruhan = 0;
        String lanjut;

        do {
            System.out.print("Masukkan nomor menu yang ingin anda pesan: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();

           
            int totalHarga = hitungTotalHarga14(pilihanMenu, banyakItem);

          
            totalKeseluruhan += totalHarga;

            System.out.print("Apakah ingin memesan menu lain? (y/n): ");
            lanjut = sc.next();

        } while (lanjut.equalsIgnoreCase("y"));

        System.out.println("============================");
        System.out.println("Total keseluruhan pesanan: " + totalKeseluruhan);
        System.out.println("============================");
    }
}
