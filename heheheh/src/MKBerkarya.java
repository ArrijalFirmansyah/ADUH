class MKBerkarya extends MataKuliah {
    // Bebas 1 data dan 1 method yang berbeda dari class induknya
    private String jenisKarya;

    public void setJenisKarya(String jenisKarya) {
        this.jenisKarya = jenisKarya;
    }

    public void displayJenisKarya() {
        System.out.println("Jenis Karya: " + jenisKarya);
    }
}