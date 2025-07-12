public class NotaPembelian extends PembelianPulsa {
    public NotaPembelian(String nama, String noHp, int nominal, String metodePembayaran) {
        super(nama, noHp, nominal, metodePembayaran);
    }

    @Override
    public String cetakNota() {
        String bonus;
        if (getNominal() >= 50000) {
            bonus = "Bonus: Kuota 1GB";
        } else if (getNominal() >= 20000) {
            bonus = "Bonus: Kuota 500MB";
        } else {
            bonus = "Bonus: Tidak ada";
        }

        return super.cetakNota() + "\n" + bonus;
    }
}