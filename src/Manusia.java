public class Manusia {
    protected String nama;
    private int usia;

    public Manusia(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
    }
}
