
import java.util.Scanner;

public class arraynilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] nilaiAkhir = new int [10];

        for (int i=0;i<nilaiAkhir.length;i++){
        System.out.println("masukkan nilai akhir ke-"+i+":");
        nilaiAkhir[i] = sc.nextInt();
        }
        
        for (int i=0;i<10;i++){
            System.out.println("nilai akhir ke-"+i+"adalah"+nilaiAkhir[i]);
            if (nilaiAkhir[i] <80) {
                System.out.println("nilai akhir ke-"+i+"tidak lulus!");
            }else if (nilaiAkhir[i] >=80){
                System.out.println("nilai akhir ke-"+i+"Lulus");
            }
            
            }

        }
    

    }

    

