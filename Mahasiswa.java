public abstract class Mahasiswa extends SIA {

    private int NIM;
    private String jurusan;

    protected Mahasiswa(String nama, String alamat, String ttl, int noTelp, int NIM, String jurusan) {
        super(nama, alamat, ttl, noTelp);
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    protected Mahasiswa() {
        NIM = 0;
        jurusan = "";
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public int getNIM() {
        return NIM;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNIM: " + NIM + "\nJurusan: " + jurusan;
    }
}