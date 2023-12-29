public class Main {
    public static void main(String[] args) {
        // a. Buat 4 objek
        MKWajib mkWajib = new MKWajib();
        MKPilihan mkPilihan = new MKPilihan();
        MKBerkarya mkBerkarya = new MKBerkarya();
        MataKuliah mataKuliah = new MataKuliah();

        // Tampilkan data masing-masing objek
        System.out.println("MK Wajib:");
        mkWajib.nama = "Matematika";
        mkWajib.sks = 3;
        mkWajib.setJenisUjian("Tulis");
        mkWajib.displayInfo();
        mkWajib.displayJenisUjian();
        System.out.println();

        System.out.println("MK Pilihan:");
        mkPilihan.nama = "Bahasa Inggris";
        mkPilihan.sks = 2;
        mkPilihan.setPraktikum(true);
        mkPilihan.displayInfo();
        mkPilihan.displayPraktikum();
        System.out.println();

        System.out.println("MK Berkarya:");
        mkBerkarya.nama = "Seni Rupa";
        mkBerkarya.sks = 4;
        mkBerkarya.setJenisKarya("Lukisan");
        mkBerkarya.displayInfo();
        mkBerkarya.displayJenisKarya();
        System.out.println();

        System.out.println("Mata Kuliah Umum:");
        mataKuliah.nama = "Pendidikan Kewarganegaraan";
        mataKuliah.sks = 2;
        mataKuliah.displayInfo();
    }
}