public class mataKuliahMain {
    public static void main(String[] args) {

        // Instansiasi object menggunakan constructor berparameter
        mataKuliah15 mk1 = new mataKuliah15(
                "Algoritma dan Struktur Data",
                "ASD123",
                3,
                6
        );

        
        System.out.println("Data Awal");
        mk1.tampilkanInformasi();

        
        System.out.println("\n Setelah Ubah SKS ");
        mk1.ubahSks(4);
        mk1.tampilkanInformasi();
       
        System.out.println("\n Setelah Tambah Jam ");
        mk1.tambahJam(2);
        mk1.tampilkanInformasi();

        
        System.out.println("\n=== Setelah Kurangi Jam ===");
        mk1.kurangiJam(3);
        mk1.tampilkanInformasi();
    }
}
