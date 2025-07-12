public class PembelianPulsa {
    private String nama, noHp, metodePembayaran;
    private int nominal;

    public PembelianPulsa(String nama, String noHp, int nominal, String metodePembayaran) {
        this.nama = nama;
        this.noHp = noHp;
        this.nominal = nominal;
        this.metodePembayaran = metodePembayaran;
    }

    public String getNama() { return nama; }
    public String getNoHp() { return noHp; }
    public int getNominal() { return nominal; }
    public String getMetodePembayaran() { return metodePembayaran; }

    public void setNama(String nama) { this.nama = nama; }
    public void setNoHp(String noHp) { this.noHp = noHp; }
    public void setNominal(int nominal) { this.nominal = nominal; }
    public void setMetodePembayaran(String metodePembayaran) { this.metodePembayaran = metodePembayaran; }

    public String cetakNota() {
        return "Nama: " + nama +
               "\nNo HP: " + noHp +
               "\nNominal: Rp" + nominal +
               "\nMetode: " + metodePembayaran;
    }

    public String cetakNota(String catatan) {
        return cetakNota() + "\nCatatan: " + catatan;
    }
}