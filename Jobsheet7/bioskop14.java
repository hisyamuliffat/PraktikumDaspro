package Jobsheet7;
import java.util.Scanner;


public class bioskop14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tiket=50000;
        int tiketTerjual;
        int diskontiket;
        double diskon4=0.04;
        double diskon10=0.15;

        System.out.println("masukkan jumlah penjualan hari ini");
        tiketTerjual=sc.nextInt();
        double totalpenjualan;
      
        

       if (tiketTerjual > 4 && tiketTerjual < 10) {
    totalpenjualan = tiket * tiketTerjual * diskon4;
    System.out.println("Karena pembelian lebih dari 4 maka mendapatkan diskon = " + totalpenjualan);

} else if (tiketTerjual > 10) {
    totalpenjualan = tiket * tiketTerjual * diskon10;
    System.out.println("Karena pembelian lebih dari 10 maka mendapatkan diskon = " + totalpenjualan);

} else if (tiketTerjual <4 && tiketTerjual>1) {
    
    totalpenjualan = tiket * tiketTerjual;
    System.out.println("Tanpa diskon = " + totalpenjualan);

} else { 
    
    for (; tiketTerjual < 1; ) {
        System.out.println("Silahkan input ulang");
        tiketTerjual = sc.nextInt();
    }
    return;
}

}

    }
    


           
           
                
            

            
        
    


        

        
        
    
    

