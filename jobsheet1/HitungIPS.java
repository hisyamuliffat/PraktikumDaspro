import java.util.Scanner;

public class HitungIPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");

        System.out.print("Jumlah mata kuliah: ");
        int jumlahMK = sc.nextInt();
        sc.nextLine();

        String[] namaMK = new String[jumlahMK];
        int[] sks = new int[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] nilaiSetara = new double[jumlahMK];

        double totalBobot = 0;
        int totalSks = 0;

        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("\nMasukkan data MK ke-" + (i + 1));

            System.out.print("Nama MK : ");
            namaMK[i] = sc.nextLine();

            System.out.print("SKS : ");
            sks[i] = sc.nextInt();

            System.out.print("Nilai Angka : ");
            nilaiAngka[i] = sc.nextDouble();
            sc.nextLine();

           
            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }

            totalBobot += nilaiSetara[i] * sks[i];
            totalSks += sks[i];
        }

        double ips = totalBobot / totalSks;

       
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("==========================================================================");
        System.out.printf("Bobot Nilai");
        System.out.println("==========================================================================");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf(
                    namaMK[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
        }

        System.out.println("==========================================================================");
        System.out.println("Total SKS : " + totalSks);
        System.out.printf("IPS       : %.2f\n", ips);
    }
}
