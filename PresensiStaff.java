import java.sql.Date;
import java.sql.Time;

public class PresensiStaff extends Presensi {
    private Time jam;

    public PresensiStaff(Date date, Status status, Time jam) {
        super(date, status);
        this.jam = jam;
    }

    public PresensiStaff(Date date, int status, Time jam) {
        super(date, status);
        this.jam = jam;
    }

    public PresensiStaff() {
        super();
        this.jam = new Time(0);
    }

    public void setJam(Time jam) {
        this.jam = jam;
    }

    public Time getJam() {
        return jam;
    }

    @Override
    public String toString() {
        return super.toString() + " Jam: " + jam.toString();
    }

}