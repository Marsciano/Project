import java.util.Scanner;
public class Main {
    void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalNilai = 0;

        System.out.println("=== Program Analisa Nilai Siswa ===");

        System.out.print("Masukan Jumlah Siswa:");
        int JumlahSiswa = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= JumlahSiswa; i++) {
            System.out.print("Masukan Nilai Siswa Ke-" + i + ":");
            double nilai=scanner.nextDouble();
            scanner.nextLine();

            totalNilai += nilai;

            if (nilai>= 75) {
                System.out.println(" >- Status: Lulus");
            } else if (nilai >= 50) {
                System.out.println(" >- Status: Remedial");
            } else {
                System.out.println(" >- Status: Tidak Lulus");
            }
            System.out.println("________________________________");
        }

        if (JumlahSiswa > 0){
            double ratarata = totalNilai / JumlahSiswa;
            System.out.println("Rata-rata Nilai Kelas: " + ratarata);
        } else System.out.println("Tidak ada data siswa yang dimasukan");

        scanner.close();
    }
}