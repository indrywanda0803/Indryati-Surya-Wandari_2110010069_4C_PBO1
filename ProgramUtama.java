import java.util.Scanner;

public class ProgramUtama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NotaPembelian[] nota = new NotaPembelian[2];

        for (int i = 0; i < nota.length; i++) {
            System.out.println("\nData Pembelian Pulsa ke-" + (i + 1));

            System.out.print("Nama: ");
            String nama = input.nextLine();

            System.out.print("No HP: ");
            String noHp = input.nextLine();

            int nominal = 0;
            while (true) {
                try {
                    System.out.print("Nominal (cth: 5000): ");
                    nominal = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Masukkan angka yang valid.");
                }
            }

            System.out.print("Metode Pembayaran (Cash/QR/Transfer): ");
            String metode = input.nextLine();

            nota[i] = new NotaPembelian(nama, noHp, nominal, metode);
        }

        System.out.println("\n=== Nota Pembelian ===");
        for (NotaPembelian n : nota) {
            System.out.println(n.cetakNota());
            System.out.println("---------------------------");
        }
    }
}