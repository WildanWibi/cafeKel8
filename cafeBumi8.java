import java.util.Scanner;

public class cafeBumi8 {
    static Scanner kel8 = new Scanner(System.in);
    static String[] daftarMenu = {"Roti Bakar Coklat", "Roti Bakar Keju", "Kentang Goreng", "Mie Goreng Spesial", "Nasi Goreng Mawut",
                                   "Cappucino", "Espresso", "Greentea", "Teh Tarik", "Susu Coklat"};
    static int[] hargaMenu = {12000, 12000, 10000, 15000, 15000,
                               7000, 10000, 13000, 8000, 10000};
    static String[][] pesanan = new String[100][5];
    static int jumlahPesanan = 0;

    public static void main(String[] args) {
        boolean menu = true;

        while (menu) {
            System.out.println("\n=========== CAFE BUMI 8 ===========");
            System.out.println("1. Transaksi Pesanan");
            System.out.println("2. Tampilkan Daftar Pesanan");
            System.out.println("3. Total Pendapatan Harian");
            System.out.println("4. Keluar");
            System.out.println("===================================");
            System.out.print("Masukkan Pilihan: ");
            int pilihan = kel8.nextInt();

            switch (pilihan) {
                case 1:
                    prosesPesanan();
                    break;
                case 2:
                    tampilkanPesanan();
                    break;
                case 3:
                    hitungTotalPendapatan();
                    break;
                case 4:
                    menu = false;
                    System.out.println("\nTerima kasih! Silahkan datang kembali.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}