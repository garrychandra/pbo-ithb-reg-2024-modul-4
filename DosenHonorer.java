import java.util.List;

public class DosenHonorer extends Dosen implements StaffMethod {
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
        return count * honorPerSKS;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHonor per SKS:" + honorPerSKS;
    }
}
