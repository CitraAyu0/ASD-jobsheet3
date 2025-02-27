import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine(); 

        Dosen[] daftarDosen = new Dosen[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            boolean jenisKelamin = sc.nextLine().equalsIgnoreCase("Pria"); 
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine(); 
            System.out.println("------------------------------------");

            daftarDosen[i] = new Dosen(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\n===== Data Dosen =====");
        for (Dosen d : daftarDosen) {
            d.cetakInfo();
        }
    }
}
