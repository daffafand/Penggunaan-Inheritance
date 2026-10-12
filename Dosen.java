public class Dosen extends Manusia {
    private String nip;
    private String fakultas;

    public Dosen(String nama, int usia, String nip, String fakultas) {
        super(nama, usia);
        this.nip = nip;
        this.fakultas = fakultas;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Fakultas: " + fakultas);
    }
}
