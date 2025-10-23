import java.util.Scanner;
public class denyutJantung15 {
    public static void main(String[] args) {
        String saran = "", kategori = "";
       Scanner sc = new Scanner(System.in);
       System.out.println("Masukkan usia : ");
       int usia = sc.nextInt();
       if (usia <= 0 || usia > 100) {
        System.out.println("Usia tidak valid");
        sc.close();
        return;
        }
       System.out.println("Masukkan Heart Rate saat latihan (denyut/menit) : ");
       int hr = sc.nextInt();
       if (hr <= 0) {
        System.out.println("Heart Rate tidak valid");
        return;
       }
       int mhr = 220 - usia;
       double persenmhr = ((double) hr / mhr) * 100;
       int mhrBulat = (int) persenmhr;


       if (mhrBulat < 50) {
        kategori = "sangat ringan";
        saran = "Pemanasan, manfaat minimal";
       } else if (mhrBulat >= 50 && mhrBulat < 60) {
        kategori = "ringan";
        saran = "Peningkatan dasar kebugaran";
       } else if (mhrBulat >= 60 && mhrBulat < 70) {
        kategori = "sedang";
        saran = "Zona aeorbik nyaman";
       } else if (mhrBulat >= 70 && mhrBulat < 86) {
        kategori = "kuat";
        saran = "Meningkatkan kapasitas kardiorespirasi";
       } else if (mhrBulat > 85) {
        kategori = "sangat berat";
        saran = "Beresiko bagi pemula, batasi durasi";
       }
    
       System.out.println("=== HASIL ===");
       System.out.println("Maximal Heart Rate : " +mhr);
       System.out.println("Presentase MHR : " +mhrBulat + "%");
       System.out.println("Kategori Latihan : " + kategori);
       System.out.println("Saran : " + saran);

    }
}
