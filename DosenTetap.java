import java.util.List;

public class DosenTetap extends Dosen {
    private int salary;

    public DosenTetap(String Nama, String alamat, String ttl, int notelp, int nik, String departemen, int salary) {
        super(Nama, alamat, ttl, notelp, nik, departemen);
        this.salary = salary;
    }

    public DosenTetap() {
        super();
        salary = 0;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalary: " + salary;
    }
}
