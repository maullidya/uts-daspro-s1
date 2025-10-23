import java.util.Scanner;
public class komisiPenjualan15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double persenKomisi;
        double totalKomisi;
        System.out.println("Masukkan omzet bulanan: ");
        int omzet = sc.nextInt();
        if (omzet < 0 ) {
            System.out.println("Omzet tidak valid");
            return;
        }
        System.out.println("Masukkan rating (1-100) : ");
        int rating = sc.nextInt();
        if (rating < 1 || rating > 100) {
            System.out.println("Rating tidak valid");
            return;
        }
        System.out.println("Apakah sudah disertifikasi (ya/tidak) ? ");
        Boolean sertifikasi;
        String inputSertifikasi = sc.next();
        if (inputSertifikasi.equalsIgnoreCase("ya")) {
            sertifikasi = true;
        } else if (inputSertifikasi.equalsIgnoreCase("tidak")) {
            sertifikasi = false;
        } else {
            System.out.println("Input sertifikasi tidak valid");
            return;
        }

        if (rating >= 70) {
            if (omzet < 50000000) {
                 persenKomisi = 0.01;
            } else if (omzet >= 50000000 && omzet <= 100000000) {
                 persenKomisi = 0.02;
            } else {
                 persenKomisi = 0.03;
            }
            if (rating >= 90) {
                 persenKomisi += 0.01;
            }
            
        }else {
             persenKomisi = 0.0;
        }
        totalKomisi = persenKomisi * omzet;
        if (sertifikasi) {
            totalKomisi += 500000;
        }
        double jumlahKomisi = persenKomisi * omzet;
        System.out.println("=== HASIL ===");
        System.out.println("Presentase Akhir Komisi: " + (persenKomisi * 100) + "%");
        System.out.println("jumlah komisi yang diperoleh: Rp " + jumlahKomisi);
        System.out.println("Bonus sertifikasi: " + (sertifikasi ? "Rp 500000" : "Rp 0"));
        System.out.println("Total Komisi Diterima: Rp " + totalKomisi);
    }
}
