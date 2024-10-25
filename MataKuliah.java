public class MataKuliah {
    private int kode;
    private int sks;
    private String nama;

    public MataKuliah(int kode, int sks, String nama) {
        this.kode = kode;
        this.sks = sks;
        this.nama = nama;
    }

    public MataKuliah() {
        kode = 0;
        sks = 0;
        nama = "";
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "kode: " + kode + "\nsks: " + sks + "\nnama: " + nama;
    }
}
