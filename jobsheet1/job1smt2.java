import java.util.Scanner;
public class job1smt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    double nilaiTugas=0, nilaiKuis=0, nilaiUts=0, nilaiUas=0;
    String huruf;
    

System.out.println("Masukkan nilai tugas: ");
nilaiTugas = sc.nextDouble();
while (nilaiTugas < 0 || nilaiTugas > 100) {
    System.out.println("Angka tidak valid, masukkan lagi!");
    nilaiTugas = sc.nextDouble();
}

System.out.println("Masukkan nilai kuis: ");
nilaiKuis = sc.nextDouble();
while (nilaiKuis < 0 || nilaiKuis > 100) {
    System.out.println("Angka tidak valid, masukkan lagi!");
    nilaiKuis = sc.nextDouble();
}

System.out.println("Masukkan nilai UTS: ");
nilaiUts = sc.nextDouble();
while (nilaiUts < 0 || nilaiUts > 100) {
    System.out.println("Angka tidak valid, masukkan lagi!");
    nilaiUts = sc.nextDouble();
}

System.out.println("Masukkan nilai UAS: ");
nilaiUas = sc.nextDouble();
while (nilaiUas < 0 || nilaiUas > 100) {
    System.out.println("Angka tidak valid, masukkan lagi!");
    nilaiUas = sc.nextDouble();
}
  double nilaiAkhir = (0.2*nilaiTugas + 0.2*nilaiKuis + 0.3*nilaiUts+ 0.4*nilaiUas);
  System.out.println("nilai akhir:" + nilaiAkhir);
if (nilaiAkhir > 80) {
    huruf = "A";
    System.out.println("sangat baik");
    System.out.println("nilai huruf A");
    System.out.println("LULUS");

} else if (nilaiAkhir > 73) {
    huruf = "B+";
    System.out.println("lebih dari baik");
    System.out.println("nilai huruf B+");
    System.out.println("LULUS");

} else if (nilaiAkhir > 65) {
    huruf = "B";
    System.out.println("baik");
    System.out.println("nilai huruf B");
    System.out.println("LULUS");

} else if (nilaiAkhir > 60) {
    huruf = "C+";
    System.out.println("lebih dari cukup");
    System.out.println("nilai huruf C+");
    System.out.println("LULUS");

} else if (nilaiAkhir > 50) {
    huruf = "C";
    System.out.println("cukup");
    System.out.println("nilai huruf C");
    System.out.println("LULUS");

} else if (nilaiAkhir > 39) {
    huruf = "D";
    System.out.println("kurang");
    System.out.println("nilai huruf D");
    System.out.println("TIDAK LULUS");

} else {
    huruf = "E";
    System.out.println("gagal");
    System.out.println("nilai huruf E");
    System.out.println("TIDAK LULUS");
}



    }
    }

