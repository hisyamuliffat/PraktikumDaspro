package Cmdaspro;

import java.util.Scanner;

public class menuMagang {
    static String[] dataNama = new String[5];
    static String[] dataNim = new String[5];
    static String[] dataProdi = new String[5];
    static String[] dataStatus = new String[5];
    static String[] tujuanMagang = new String[5];

    static int jumlahData = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilihMenu;
        while (true) {
            System.out.println("\n====Sistem Pendaftaran Magang Mahasiswa===");
            System.out.println("1.Tambah data Magang");
            System.out.println("2.Tampilkan semua pendaftar Magang");
            System.out.println("3.Cari pendaftar berdasarkan progam studi");
            System.out.println("4.Hitung jumlah pendaftar untuk setiap status semester");
            System.out.println("5.Keluar");
            System.out.println("Pilih Menu (1-5):");
            pilihMenu = sc.nextInt();
            sc.nextLine();

            switch (pilihMenu) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    tampilkansemuaData();
                    break;
                case 3:
                    cariData();
                    break;
                case 4:
                    hitungStatus();
                    break;
                case 5:
                    if (pilihMenu == 5)
                        System.out.println("terima kasih telah menggunakan menu");
                    return;

                default:
                    System.out.println("Menu Invalid,Pilih Menu Lain");
                    break;

            }
        }

    }

   private static void tambahData() {
    Scanner sc = new Scanner(System.in);

    if (jumlahData < 5) {

        System.out.print("Nama mahasiswa: ");
        dataNama[jumlahData] = sc.nextLine();

        System.out.print("NIM: ");
        dataNim[jumlahData] = sc.nextLine();

        System.out.print("Program Studi: ");
        dataProdi[jumlahData] = sc.nextLine();

        System.out.print("Tujuan Magang: ");
        tujuanMagang[jumlahData] = sc.nextLine();

        System.out.print("Status magang (diterima/menunggu/ditolak): ");
        dataStatus[jumlahData] = sc.nextLine();

        if (!dataStatus[jumlahData].equalsIgnoreCase("diterima") &&
            !dataStatus[jumlahData].equalsIgnoreCase("menunggu") &&
            !dataStatus[jumlahData].equalsIgnoreCase("ditolak")) {

            System.out.println("Status tidak valid! Dianggap 'menunggu'.");
            dataStatus[jumlahData] = "menunggu";
        }

        jumlahData++;

        System.out.println("Data berhasil disimpan.");
       

        System.out.print("Ketik 'kembali' untuk kembali ke menu, atau ENTER untuk lanjut: ");
        String kembali = sc.nextLine();
        if (kembali.equalsIgnoreCase("kembali")) {
            
        }
    }
}


    private static void tampilkansemuaData() {
        System.out.println("menampilkan semua pendaftar magang");

        System.out.println("\n=== DAFTAR PENDAFTAR MAGANG ===");
        if (jumlahData == 0) {
            System.out.println("belom ada data yang di input");
        }

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.println("Nama   : " + dataNama[i]);
            System.out.println("NIM    : " + dataNim[i]);
            System.out.println("Prodi  : " + dataProdi[i]);
            System.out.println("Tujuan Magang:" + tujuanMagang[i]);
            System.out.println("Status : " + dataStatus[i]);
            System.out.println("-----------------------------");

        }

    }

    private static void cariData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cari Mahasiswa berdasarkan prodi: ");
        String cariMhs = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < jumlahData; i++) {
            if (dataProdi[i].equalsIgnoreCase(cariMhs)) {

                System.out.println(" DATA DITEMUKAN");
                System.out.println("Nama   : " + dataNama[i]);
                System.out.println("NIM    : " + dataNim[i]);
                System.out.println("Prodi  : " + dataProdi[i]);
                System.out.println("Tujuan Magang:" + tujuanMagang[i]);
                System.out.println("Status : " + dataStatus[i]);

                ditemukan = true;
                break; //
            }
        }

        if (!ditemukan) {
            System.out.println("Data dengan prodi \"" + cariMhs + "\" tidak ditemukan.");
        }

        
    }

    private static void hitungStatus() {
        int jumlahDiterima = 0;
        int jumlahMenunggu = 0;
        int jumlahDitolak = 0;

        for (int i = 0; i < jumlahData; i++) {
            if (dataStatus[i].equalsIgnoreCase("diterima")) {
                jumlahDiterima++;
            } else if (dataStatus[i].equalsIgnoreCase("menunggu")) {
                jumlahMenunggu++;
            } else if (dataStatus[i].equalsIgnoreCase("ditolak")) {
                jumlahDitolak++;
            }
        }

        System.out.println("Jumlah berdasarkan status");
        System.out.println("Diterima : " + jumlahDiterima);
        System.out.println("Menunggu : " + jumlahMenunggu);
        System.out.println("Ditolak  : " + jumlahDitolak);
    }

}
