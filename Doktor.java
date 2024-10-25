public class Doktor extends Mahasiswa {
    private String judulPenelitian;
    private int sidang1 = 0;
    private int sidang2 = 0;
    private int sidang3 = 0;

    public Doktor(String nama, String alamat, String ttl, int noTelp, int nim, String jurusan, String judulPenelitian) {
        super(nama, alamat, ttl, noTelp, nim, jurusan);
        this.judulPenelitian = judulPenelitian;
    }

    public Doktor() {
        judulPenelitian = "";
    }

    public String getJudulPenelitian() {
        return judulPenelitian;
    }

    public void setJudulPenelitian(String judulPenelitian) {
        this.judulPenelitian = judulPenelitian;
    }

    public int getSidang1() {
        return sidang1;
    }

    public void setSidang1(int sidang1) {
        this.sidang1 = sidang1;
    }

    public int getSidang2() {
        return sidang2;
    }

    public void setSidang2(int sidang2) {
        this.sidang2 = sidang2;
    }

    public int getSidang3() {
        return sidang3;
    }

    public void setSidang3(int sidang3) {
        this.sidang3 = sidang3;
    }

    @Override
    public String toString() {
        return super.toString() + "\njudul penelitian: " + judulPenelitian + "\nnilai sidang 1: " + sidang1
                + "\nnilai sidang 2: " + sidang2 + "\nnilai sidang 3: " + sidang3;
    }

}
