import java.util.Scanner;

public class MainRoyalDelish15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DoubleLinkedListPembeli15 antrian =
                new DoubleLinkedListPembeli15();

        DoubleLinkedListPesanan15 daftarPesanan =
                new DoubleLinkedListPesanan15();

        int pilih;

        do {

            System.out.println("\n==============================");
            System.out.println("      RESTO ROYAL DELISH");
            System.out.println("==============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian & Input Pesanan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu : ");

            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();

                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();

                    antrian.tambahAntrian(nama, hp);

                    break;

                case 2:

                    antrian.cetakAntrian();

                    break;

                case 3:

                    Pembeli15 keluar = antrian.hapusAntrian();

                    if (keluar != null) {

                        System.out.println("\nPembeli dipanggil:");
                        System.out.println("No Antrian : "
                                + keluar.noAntrian);

                        System.out.println("Nama       : "
                                + keluar.namaPembeli);

                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Menu    : ");
                        String menu = sc.nextLine();

                        System.out.print("Harga        : ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        Pesanan15 pesanan =
                                new Pesanan15(kode, menu, harga);

                        daftarPesanan.tambahPesanan(pesanan);

                        System.out.println(
                                "Pesanan berhasil ditambahkan!");
                    }

                    break;

                case 4:

                    daftarPesanan.tampilPesanan();

                    break;

                case 5:

                    System.out.println("Program selesai!");

                    break;

                default:

                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilih != 5);

        sc.close();
    }
}