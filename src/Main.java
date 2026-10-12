public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Budi", 20, "123456", "Teknik Informatika");
        Dosen dosen = new Dosen("Dr. Siti", 45, "987654", "Ilmu Komputer");

        System.out.println("Informasi Mahasiswa:");
        mahasiswa.tampilkanInfo();

        System.out.println();

        System.out.println("Informasi Dosen:");
        dosen.tampilkanInfo();
    }
}
