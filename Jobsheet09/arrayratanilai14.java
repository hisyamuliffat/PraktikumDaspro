import java.util.Scanner;
public class arrayratanilai14 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int [] nilaiMhs= new int[10];
       double total = 0;
       double rata2;
      
       int jmlmhsLulus=0;
       int jmlmhstdkLulus=0;
       

       for (int i=0; i < nilaiMhs.length;i++){
        System.out.println("masukkan nilai mahasiswa ke-"+(i+1)+":");
        nilaiMhs[i]=sc.nextInt();
        if (nilaiMhs[i] >70){
            jmlmhsLulus+= nilaiMhs[i];
       }if (nilaiMhs[i] <70){
            jmlmhstdkLulus+=nilaiMhs[i];

       }

    }for (int i=0;i<nilaiMhs.length;i++){
        total += nilaiMhs[i];
       }
       
      

       
       
       rata2 = total/nilaiMhs.length;
       double rata2mahasiswalulus = jmlmhsLulus/nilaiMhs.length;
       double rata2mahasiswatidaklulus = jmlmhstdkLulus/nilaiMhs.length;
       System.out.println("rata-rata nilai ="+rata2);
        System.out.println("Rata Rata mahasiswa lulus=" + rata2mahasiswalulus);
         System.out.println("Rata Rata mahasiswa tidak lulus=" + rata2mahasiswatidaklulus);

       

    }
    
}
