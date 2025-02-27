public class DataDosen {

    public static void tampilkanSemuaDosen(Dosen[] daftarDosen) {
        System.out.println("\n===== Data Semua Dosen =====");
        for (Dosen d : daftarDosen) d.cetakInfo();
    }

    public static void jumlahDosenPerJenisKelamin(Dosen[] daftarDosen) {
        int pria = 0, wanita = 0;
        for (Dosen d : daftarDosen) {
            if (d.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("\n===== Jumlah Dosen Per Jenis Kelamin =====");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
    }

    public static void rataRataUsiaPerJenisKelamin(Dosen[] daftarDosen) {
        int totalPria = 0, totalWanita = 0, countPria = 0, countWanita = 0;

        for (Dosen d : daftarDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                countPria++;
            } else {
                totalWanita += d.usia;
                countWanita++;
            }
        }

        System.out.println("\n===== Rata-rata Usia Dosen =====");
        System.out.println("Pria   : " + (countPria > 0 ? totalPria / countPria : 0));
        System.out.println("Wanita : " + (countWanita > 0 ? totalWanita / countWanita : 0));
    }

    public static void dosenTertua(Dosen[] daftarDosen) {
        Dosen tertua = daftarDosen[0];
        for (Dosen d : daftarDosen) {
            if (d.usia > tertua.usia) tertua = d;
        }
        System.out.println("\n===== Dosen Paling Tua =====");
        tertua.cetakInfo();
    }

    public static void dosenTermuda(Dosen[] daftarDosen) {
        Dosen termuda = daftarDosen[0];
        for (Dosen d : daftarDosen) {
            if (d.usia < termuda.usia) termuda = d;
        }
        System.out.println("\n===== Dosen Paling Muda =====");
        termuda.cetakInfo();
    }
}