public abstract class Staff extends SIA {
    private int nik;

    protected Staff() {
        super();
        nik = 0;
    }

    protected Staff(String nama, String alamat, String ttl, int noTelp, int nik) {
        super(nama, alamat, ttl, noTelp);
        this.nik = nik;
    }

    public void setnik(int nIK) {
        nik = nIK;
    }

    public int getnik() {
        return nik;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNIK: " + nik;
    }
}
