public class mahasiswa15 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi (){

        System.out.println("nama" + nama);
        System.out.println("NIM" +nim);
        System.out.println("IPK" + ipk);
        System.out.println("kelas:" +  kelas);
    }
    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }
    void updateIpk(double ipkbaru){
        ipk = ipkbaru;
        if (ipk <= 0.0 || ipk >= 4.0){
            System.out.println("IPK TIDAK VALID, HARUS ANTARA 0.0 & 4.0");
            
        }
    }
     String nilaiKinerja () {
        if (ipk >= 3.5) {
            return "kinerja sangat baik";
        } else if (ipk >= 3.0){
            return "kinerja baik";
        } else if (ipk >= 2.0){
            return "kinerja cukup";
        }else{
            return "kinerja kurang";
        }



    }
    public mahasiswa15(){
     } public mahasiswa15(String nm, String nim, double ipk, String kls){
        nama= nm;
        this.nim=nim;
        this.ipk=ipk;
        kelas=kls;
     }
     
    
    
}



