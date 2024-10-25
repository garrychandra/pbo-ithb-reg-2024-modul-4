import java.util.List;

public class DosenTetap extends Dosen implements StaffMethod {
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
    public int getGaji() {
        int count = 0;
        List<MatkulAjar> matkulAjar = super.getMatkulAjar();

        for(int i = 0; i < matkulAjar.size(); i++){
            MatkulAjar matkulIni = matkulAjar.get(i);
            for(int j = 0; j < matkulIni.getPresensi().size(); j++){
                if(matkulIni.getPresensi().get(j).getStatus() == Status.HADIR){
                    count++;
                }
            }
        }
        return salary + (count * 25000);
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalary: " + salary;
    }
}
