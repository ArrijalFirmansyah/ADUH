class MKWajib extends MataKuliah {
    // Bebas 1 data dan 1 method yang berbeda dari class induknya
    private String jenisUjian;

    public void setJenisUjian(String jenisUjian) {
        this.jenisUjian = jenisUjian;
    }

    public void displayJenisUjian() {
        System.out.println("Jenis Ujian: " + jenisUjian);
    }
}
