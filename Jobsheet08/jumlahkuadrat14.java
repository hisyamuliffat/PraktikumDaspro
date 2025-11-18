package Jobsheet08;
import java.util.Scanner;
public class jumlahkuadrat14 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt();

   
        for (int i = 1; i <= n; i++) {
            int jumlahKuadrat = 0;
            System.out.print("n = " + i + " → jumlah kuadrat = ");

           
            for (int j = 1; j <= i; j++) {
                jumlahKuadrat += j * j;
                System.out.print(j * j);
                if (j < i) {
                    System.out.print(" + ");
                }
            }

            System.out.println(" = " + jumlahKuadrat);
        }

    }
    
}
