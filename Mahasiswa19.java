public class Mahasiswa19 {
    String nama;
    String nim;
    String kelas;
    int nilai;

    public Mahasiswa19(String nim, String nama, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1;
    }
    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
    
}

