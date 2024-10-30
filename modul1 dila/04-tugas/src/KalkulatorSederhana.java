import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan pilihan operasi
        System.out.println("=== Kalkulator Sederhana ===");
        System.out.println("Pilih operasi yang ingin dilakukan:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        // Meminta pengguna memasukkan pilihan operasi
        System.out.print("Masukkan pilihan (1/2/3/4): ");
        int pilihan = input.nextInt();

        // Meminta pengguna memasukkan dua angka
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        // Variabel untuk menyimpan hasil
        double hasil = 0;

        // Memproses operasi berdasarkan pilihan
        if (pilihan == 1) {
            hasil = angka1 + angka2;
            System.out.println("Hasil penjumlahan: " + hasil);
        } else if (pilihan == 2) {
            hasil = angka1 - angka2;
            System.out.println("Hasil pengurangan: " + hasil);
        } else if (pilihan == 3) {
            hasil = angka1 * angka2;
            System.out.println("Hasil perkalian: " + hasil);
        } else if (pilihan == 4) {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
                System.out.println("Hasil pembagian: " + hasil);
            } else {
                System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}
