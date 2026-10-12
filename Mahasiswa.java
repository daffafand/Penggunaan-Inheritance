public class Mahasiswa extends Manusia {
    private String nim;
    private String jurusan;

    public Mahasiswa(String nama, int usia, String nim, String jurusan) {
        super(nama, usia);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }
}
