import java.util.Scanner;

public class Tugas317 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal harus 1.");
        } else {
            int totalBarangSeluruhToko = 0;
            int maxBarangToko = -1;
            int tokoDenganBarangTerbanyak = 0;

            for (int i = 1; i <= jumlahToko; i++) {
                System.out.print("Masukkan jumlah pelanggan untuk Toko " + i + ": ");
                int jumlahPelanggan = sc.nextInt();

                int totalBarangPerToko = 0;

                for (int j = 1; j <= jumlahPelanggan; j++) {
                    System.out.print("  Jumlah barang yang dibeli pelanggan " + j + ": ");
                    int jumlahBarang = sc.nextInt();
                    totalBarangPerToko += jumlahBarang; 
                }

                totalBarangSeluruhToko += totalBarangPerToko;

                System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangPerToko);

                if (totalBarangPerToko > maxBarangToko) {
                    maxBarangToko = totalBarangPerToko;
                    tokoDenganBarangTerbanyak = i;
                }
            }

            System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoDenganBarangTerbanyak);
        }

        sc.close();
    }
}
