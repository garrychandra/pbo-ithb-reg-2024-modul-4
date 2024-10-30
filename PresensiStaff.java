import java.sql.Date;

public class PresensiStaff extends Presensi {
    private int jam;

    public PresensiStaff(Date date, Status status, int jam) {
        super(date, status);
        this.jam = jam;
    }

    public PresensiStaff(Date date, int status, int jam) {
        super(date, status);
        this.jam = jam;
    }

    public PresensiStaff() {
        super();
        this.jam = 0;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public int getJam() {
        return jam;
    }

    @Override
    public String toString() {
        return super.toString() + " Jam: " + jam;
    }

}