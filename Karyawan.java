import java.util.List;
import java.util.ArrayList;

public class Karyawan extends Staff {
    private int salary;
    private List<PresensiStaff> presensiStaff;

    public Karyawan(String nama, String alamat, String ttl, int noTelp, int nik, int salary) {
        super(nama, alamat, ttl, noTelp, nik);
        this.salary = salary;
        presensiStaff = new ArrayList<>();
    }

    public Karyawan() {
        super();
        salary = 0;
        presensiStaff = new ArrayList<>();
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setPresensiStaff(List<PresensiStaff> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

    public List<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalary: " + salary + "\nPresensi Staff: " + presensiStaff.toString();
    }
}
