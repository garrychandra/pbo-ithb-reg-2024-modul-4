import java.util.List;
import java.util.ArrayList;

public class MatkulAmbil {
    private MataKuliah mataKuliah;
    private List<Presensi> presensi;
    private int n1;
    private int n2;
    private int n3;

    public MatkulAmbil(MataKuliah mataKuliah, int n1, int n2, int n3) {
        this.mataKuliah = mataKuliah;
        presensi = new ArrayList<>();
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n2;
    }

    public MatkulAmbil(){
        mataKuliah = new MataKuliah();
        presensi = new ArrayList<Presensi>();
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public List<Presensi> getPresensi() {
        return presensi;
    }

    public void setPresensi(List<Presensi> presensi) {
        this.presensi = presensi;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN1() {
        return n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN2() {
        return n2;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public int getN3() {
        return n3;
    }

    @Override
    public String toString() {
        return mataKuliah.toString() + "\nPresensi: " + presensi + "\nNilai 1: " + n1 + "\nNilai 2: " + n2
                + "\nNilai 3: " + n3 + "\n";
    }

}