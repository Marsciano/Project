import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to LabIT RPG!");

        System.out.println("Insert Your Name: ");
        String Nama = scanner.nextLine();

        System.out.println("Insert Your Age: ");
        Integer Umur = scanner.nextInt();

        if (Umur < 13) {
            System.out.println("Maaf, Kamu minimal 13 tahun ke atas untuk memainkan ini.");

            scanner.close();
            return;
        } else {
            System.out.printf("Helo %s, age %d ! Mari memulai Adventur Kamu!", Nama, Umur);
        }
        System.out.println("Ayo bikin karakter Mu!");

        boolean LanjutanKreasi = true;
        do {
            System.out.println("Choose your class");
            System.out.println("1. Warior");
            System.out.println("2. Mage");
            System.out.println("3. Arher");


            System.out.println("Masukan Kelas Pilihanmu: ");
            int PilihanKelas = scanner.nextInt();
            scanner.nextLine();

            switch (PilihanKelas) {
                case 1:
                    LanjutanKreasi = false;
                    System.out.println("Kamu Telah Memilih Kelas Warrior");
                    break;

                case 2:
                    LanjutanKreasi = false;
                    System.out.println("Kamu Telah Memilih Kelas Mage");
                    break;

                case 3:
                    LanjutanKreasi = false;
                    System.out.println("Kamu Telah Memilih Kelas Archer");
                    break;

                default:
                    System.out.println("Pilihan tidak ditemukan, mulai ulang game dan coba lagi");
                    break;
            }
        } while (LanjutanKreasi);

        System.out.println("Kreasi Karakter Komplit, Bersiaplah untuk Pertualangan MU!");
    }
}