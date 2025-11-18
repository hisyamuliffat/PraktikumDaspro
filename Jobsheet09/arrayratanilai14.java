import java.util.Scanner;

public class arrayratanilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;

        double tertinggi = 0;
        double terendah = 100;

        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }

            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

       
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        rata2 = total / nilaiMhs.length;

        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Nilai Terendah Mahasiswa = " + terendah);
        System.out.println("Nilai Tertinggi Mahasiswa = " + tertinggi);
    }
}
