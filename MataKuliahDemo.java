import java.util.Scanner;
public class MataKuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();
        sc.nextLine(); 
        
        MataKuliah[] arrayOfMataKuliah = new MataKuliah[jumlahMataKuliah];

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("\nMasukkan Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah("", "", 0, 0); 
            arrayOfMataKuliah[i].tambahData(); 
        }

        System.out.println("\n===== Data Mata Kuliah =====");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo(); 
        }
    }
}