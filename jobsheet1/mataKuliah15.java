public class mataKuliah15 {

    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

   
    void tampilkanInformasi() {
        System.out.println("Nama        : " + nama);
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
    }

    
    void ubahSks(int sksBaru) {
        sks = sksBaru;
    }

 
    void tambahJam(int jam) {
        jumlahJam += jam;
    }

  
    void kurangiJam(int jamKurang) {
        jumlahJam -= jamKurang;
    }

   
    public mataKuliah15() {

    }

   
    public mataKuliah15(String nama, String kodeMK, int sks, int jumlahJam) {
        this.nama = nama;
        this.kodeMK = kodeMK;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
