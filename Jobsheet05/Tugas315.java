package Jobsheet05;
import java.util.Scanner;

public class Tugas315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input tiga bilangan
        System.out.print("Masukkan bilangan pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int b = sc.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int c = sc.nextInt();

        int max, min;

        
        if (a >= b && a >= c)
            max = a;
        else if (b >= a && b >= c)
            max = b;
        else
            max = c;

        
        if (a <= b && a <= c)
            min = a;
        else if (b <= a && b <= c)
            min = b;
        else
            min = c;

        System.out.println("Bilangan maksimum = " + max);
        System.out.println("Bilangan minimum = " + min);
    }
}
        
    
    

