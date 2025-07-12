package uas_pbo1;

import java.util.Scanner;

public class ProgramUtama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Program Pembelian Pulsa ===");

        System.out.print("Masukkan Nama Pembeli : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Nomor HP     : ");
        String nomor = input.nextLine();

        System.out.println("Pilih Kartu:");
        System.out.println("1. XL");
        System.out.println("2. Telkomsel");
        System.out.println("3. Axis");
        System.out.print("Pilihan Anda (1-3): ");
        int pilihan = input.nextInt();
        input.nextLine(); // konsumsi newline

        String kartu;
        switch (pilihan) {
            case 1: kartu = "XL"; break;
            case 2: kartu = "Telkomsel"; break;
            case 3: kartu = "Axis"; break;
            default: kartu = "Tidak Diketahui"; break;
        }

        System.out.print("Masukkan Nominal Pulsa: ");
        int nominal = input.nextInt();

        PembelianPulsa pembelian = new PembelianPulsa(nama, nomor, kartu, nominal);
        NotaPembelian nota = new NotaPembelian();
        nota.cetakNota(pembelian);

        input.close();
    }
}
