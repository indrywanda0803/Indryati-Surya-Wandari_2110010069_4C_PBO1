package uas_pbo1;

public class PembelianPulsa {
    private String nama, noHP, kartu;
    private int nominal;

    public PembelianPulsa(String nama, String noHP, String kartu, int nominal) {
        this.nama = nama;
        this.noHP = noHP;
        this.kartu = kartu;
        this.nominal = nominal;
    }

    public String getNama() {
        return nama;
    }

    public String getNoHP() {
        return noHP;
    }

    public String getKartu() {
        return kartu;
    }

    public int getNominal() {
        return nominal;
    }

    public int getTotalBayar() {
        return nominal + 3000;
    }
}
