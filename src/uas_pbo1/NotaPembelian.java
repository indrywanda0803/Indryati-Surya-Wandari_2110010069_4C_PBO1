package uas_pbo1;

public class NotaPembelian {
    public void cetakNota(PembelianPulsa data) {
        System.out.println("=========================================");
        System.out.println("               Toko Wanda");
        System.out.println("       Alamat: Balitan Banjarbaru");
        System.out.println("=========================================");
        System.out.println("Nama Pembeli : " + data.getNama());
        System.out.println("Nomor HP     : " + data.getNoHP());
        System.out.println("Kartu        : " + data.getKartu());
        System.out.println("Nominal Pulsa: Rp " + data.getNominal());
        System.out.println("Total Bayar  : Rp " + data.getTotalBayar());
        System.out.println("=========================================");
        System.out.println("   Terima kasih telah membeli di sini");
    }
}
