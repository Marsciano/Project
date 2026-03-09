package Project;

import java.util.Scanner;
import java.util.ArrayList;

class Bangunan{
    String nama, alamat;
    Integer lantai;
    Bangunan(String nama, String alamat, int lantai) {
        this.nama = nama;
        this.alamat = alamat;
        this.lantai = lantai;
    }

    void display() {
        System.out.println("Nama Project.Bangunan: " + nama);
        System.out.println("Alamat Project.Bangunan: " + alamat);
        System.out.println("Lantai Ke: " + lantai);
        System.out.println(" ======================== ");
        System.out.println(" ");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Bangunan> daftarBangunan = new ArrayList<>();
        while (true) {

            System.out.println("Welcome to Smart City Management System");
            System.out.println("1. Add New Building");
            System.out.println("2. View All Buildings");
            System.out.println("3. Exit");
            System.out.print("Please select an option: ");
            int pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                System.out.println("Masukan berapa data yang dimasukan: ");
                int loop = input.nextInt();
                input.nextLine();
                for (int i = 0; i < loop; i++) {
                    System.out.print("Enter Building Name: ");
                    String nama = input.nextLine();
                    System.out.print("Enter Building Address: ");
                    String alamat = input.nextLine();
                    System.out.print("Enter Number of Floors: ");
                    int lantai = input.nextInt();
                    input.nextLine();
                    Bangunan bangunan = new Bangunan(nama, alamat, lantai);
                    daftarBangunan.add(bangunan);
                    System.out.printf("Building added successfully %d!\n", i);
                }

            } else if (pilihan == 2) {
                if (daftarBangunan.isEmpty()) {
                    System.out.println("No building data available.\n");
                } else {
                    System.out.println("\n===== LIST OF BUILDINGS =====");
                    for (Bangunan b : daftarBangunan) {
                        b.display();
                    }
                }
            } else if (pilihan == 3) {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Invalid option!\n");
            }
        }
        input.close();
    }


    }

