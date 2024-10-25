import java.util.List;

public class DosenHonorer extends Dosen {
    private int honorPerSKS;

    public DosenHonorer(String Nama, String alamat, String ttl, int notelp, int nik, String departemen,int honorPerSKS) {
        super(Nama, alamat, ttl, notelp, nik, departemen);
        this.honorPerSKS = honorPerSKS;
    }

    public DosenHonorer() {
        super();
        honorPerSKS = 0;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHonor per SKS:" + honorPerSKS;
    }
}
