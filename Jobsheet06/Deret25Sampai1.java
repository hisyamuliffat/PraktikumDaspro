public class Deret25Sampai1 {
    public static void main(String[] args) {
        int jumlah = 0;

        for (int i = 25; i >= 1; i--) {
            System.out.println(i);
            jumlah += i;
        }

        System.out.println("Hasil penjumlahan deret 25 sampai 1 adalah: " + jumlah);
    }
}

    