package Project;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Bangunan> daftarBangunan = new ArrayList<>();

        while (true) {
            System.out.println("Welcome to Smart City Management System");
            System.out.println("1. Tambah Bangunan Baru");
            System.out.println("2. Lihat List Bangunan");
            System.out.println("3. Keluar");
            System.out.print("Silahkan Pilih Opsinya: ");

            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukan jumlah data yang ingin di input: ");
                    int loop = input.nextInt();
                    input.nextLine();

                    for (int i = 0; i < loop; i++) {
                        System.out.print("Masukan Nama Bangunan: ");
                        String nama = input.nextLine();

                        System.out.print("Masukan Alamat Bangunan: ");
                        String alamat = input.nextLine();

                        System.out.print("Masukan Lantai Bangunan: ");
                        int lantai = input.nextInt();
                        input.nextLine();

                        Bangunan bangunan = new Bangunan(nama, alamat, lantai);
                        daftarBangunan.add(bangunan);

                        System.out.printf("Bangunan Berhasil Ditambahkan %d!\n", i + 1);
                    }
                    break;

                case 2:
                    if (daftarBangunan.isEmpty()) {
                        System.out.println("No building data available.\n");
                    } else {
                        System.out.println("\n===== LIST BANGUNAN =====");
                        for (Bangunan b : daftarBangunan) {
                            b.display();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Keluar Program...");
                    return; // langsung keluar dari main, lebih clean dari break loop

                default:
                    System.out.println("Invalid option!\n");
            }
        }
    }
}