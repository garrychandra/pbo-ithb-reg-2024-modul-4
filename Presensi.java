import java.sql.Date;

public class Presensi {
    private Date date;
    private Status status;

    public Presensi(Date date, Status status) {
        this.date = date;
        this.status = status;
    }

    public Presensi(Date date, int status) {
        this.date = date;
        this.status = Status.values()[status];
    }

    public Presensi() {
        date = new Date(0);
        status = Status.ALPHA;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Tanggal: " + date.toString() + " Status: " + status;
    }

}
