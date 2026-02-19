import java.util.Scanner;

public class JadwalKuliah {

    static Scanner sc = new Scanner(System.in);

    // ================= INPUT =================
    static void inputJadwal(String[][] jadwal, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nData jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang           : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari            : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam             : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    
    static void tampilSemua(String[][] jadwal, int n) {
    System.out.println("\n===== SEMUA JADWAL =====");
    System.out.println("==================================================================");
    System.out.printf("%-25s %-15s %-10s %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
    System.out.println("==================================================================");

    for (int i = 0; i < n; i++) {
        System.out.printf("%-25s %-15s %-10s %-15s\n",
                jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
    }

    System.out.println("==================================================================");
}

        
    

 
    static void cariHari(String[][] jadwal, int n) {
        System.out.print("Masukkan hari yang dicari: ");
        String cari = sc.nextLine();
        boolean ketemu = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(cari)) {
                if (!ketemu) {
                    System.out.printf( "Mata Kuliah", "Ruang", "Hari", "Jam");
                }
                ketemu = true;
                System.out.printf(
                        jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
        }

        if (!ketemu) {
            System.out.println("Jadwal tidak ditemukan.");
        }
    }

  
    static void cariMK(String[][] jadwal, int n) {
        System.out.print("Masukkan mata kuliah yang dicari: ");
        String cari = sc.nextLine();
        boolean ketemu = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(cari)) {
                if (!ketemu) {
                    System.out.printf( "Mata Kuliah", "Ruang", "Hari", "Jam");
                }
                ketemu = true;
                System.out.printf(
                        jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
        }

        if (!ketemu) {
            System.out.println("Jadwal tidak ditemukan.");
        }
    }

    public static void main(String[] args) {

        System.out.print("Jumlah jadwal: ");
        int n = Integer.parseInt(sc.nextLine());

        String[][] jadwal = new String[n][4];

        int pilih;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Input Jadwal");
            System.out.println("2. Tampilkan Semua");
            System.out.println("3. Cari Berdasarkan Hari");
            System.out.println("4. Cari Berdasarkan Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = Integer.parseInt(sc.nextLine());

            switch (pilih) {
                case 1:
                    inputJadwal(jadwal, n);
                    break;
                case 2:
                    tampilSemua(jadwal, n);
                    break;
                case 3:
                    cariHari(jadwal, n);
                    break;
                case 4:
                    cariMK(jadwal, n);
                    break;
                case 5:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak ada.");
            }

        } while (pilih != 5);
    }
}
