class MKPilihan extends MataKuliah {
    // Bebas 1 data dan 1 method yang berbeda dari class induknya
    private boolean praktikum;

    public void setPraktikum(boolean praktikum) {
        this.praktikum = praktikum;
    }

    public void displayPraktikum() {
        System.out.println("Praktikum: " + (praktikum ? "Ya" : "Tidak"));
    }
}
