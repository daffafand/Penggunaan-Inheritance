public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("Kirito", 35, "123456", "Teknik");
        dosen.tampilkanInfo();

        System.out.println();
        
        Mahasiswa mahasiswa = new Mahasiswa("Daffa", 20, "1234567", "Teknik Elektro");
        mahasiswa.tampilkanInfo();
    }
}    
