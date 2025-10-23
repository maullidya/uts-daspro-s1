import java.util.Scanner;
public class angkaTerkecil15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int angka1, angka2, angka3;
       System.out.println("Masukkan angka ke-1: ");
       angka1 = sc.nextInt();
       System.out.println("Masukkan angka ke-2: ");
       angka2 = sc.nextInt();
       System.out.println("Masukkan angka ke-3: ");
       angka3 = sc.nextInt();
       int terkecil = angka1;
       if (angka2 < terkecil) {
            terkecil = angka2;
       }
       if (angka3 < terkecil) {
            terkecil = angka3;
       }
       if ((angka1 == terkecil && angka2 == terkecil && angka3 == terkecil)) {
            System.out.println("Semua angka sama kecilnya: " + terkecil);
        } else if ((angka1 == terkecil && angka2 == terkecil) || (angka1 == terkecil && angka3 == terkecil) || (angka2 == terkecil && angka3 == terkecil)) {
            System.out.print("Ada beberapa angka terkecil dengan nilai: " + terkecil);
            System.out.print("\nAngka terkecil tersebut adalah: ");
            if (angka1 == terkecil) System.out.print("angka ke-1 (" + angka1 + ") ");
            if (angka2 == terkecil) System.out.print("angka ke-2 (" + angka2 + ") ");
            if (angka3 == terkecil) System.out.print("angka ke-3 (" + angka3 + ") ");
        } else {
            System.out.println("Angka terkecil adalah: " + terkecil);
        }
    }
}