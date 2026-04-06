package Project;

public class Bangunan {
    private String nama, alamat;
    private int lantai;

    public Bangunan(String nama, String alamat, int lantai) {
        this.nama = nama;
        this.alamat = alamat;
        this.lantai = lantai;
    }

    public void display() {
        System.out.println("Nama Bangunan: " + nama);
        System.out.println("Alamat Bangunan: " + alamat);
        System.out.println("Jumlah Lantai: " + lantai);
        System.out.println("========================");
        System.out.println();
    }
}