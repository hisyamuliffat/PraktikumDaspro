package Jobsheet08;
import java.util.Scanner;

public class nilaikelompok14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai,totalNilai,rataNilai;
        totalNilai=0;

        int i = 1;
while (i<=6){
            System.out.println("kelompok" + i);


        for (int j=1;j<=5;j++) {
            System.out.println("masukkan nilai ke-" + j + ":");
            nilai = sc.nextDouble();
            totalNilai += nilai;
        }
            rataNilai = totalNilai/5;
 System.out.println("rata-rata:" + rataNilai);
 i++;
            

}
 

        
    }
    
}
