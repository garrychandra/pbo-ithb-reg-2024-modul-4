import java.util.List;
import java.util.ArrayList;

public abstract class Dosen extends Staff{
    private String departemen;
    private List<MatkulAjar> matkulAjar;

    protected Dosen(String Nama, String alamat, String ttl, int notelp, int nik, String departemen) {
        super(Nama, alamat, ttl, notelp, nik);
        this.departemen = departemen;
        matkulAjar = new ArrayList<>();
    }

    protected Dosen() {
        super();
        departemen = "";
        matkulAjar = new ArrayList<>();
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setMatkulAjar(List<MatkulAjar> matkulAjar) {
        this.matkulAjar = matkulAjar;
    }

    public List<MatkulAjar> getMatkulAjar() {
        return matkulAjar;
    }

    @Override
    public String toString() {
        return super .toString() +"\nDepartemen: " + departemen + "\nMata Kuliah Diajar: " + matkulAjar.toString();
    }

}
