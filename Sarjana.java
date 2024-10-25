import java.util.ArrayList;
import java.util.List;

public class Sarjana extends Mahasiswa implements MahasiswaMethod{
    private List<MatkulAmbil> matkul;

    public Sarjana(String nama, String alamat, String ttl, int noTelp, int nim, String jurusan){
        super(nama, alamat, ttl, noTelp, nim, jurusan);
        matkul = new ArrayList<>();
    }

    public Sarjana() {
        super();
        matkul = new ArrayList<>();
    }

    public List<MatkulAmbil> getMatkul() {
        return matkul;
    }

    public void setMatkul(List<MatkulAmbil> matkul) {
        this.matkul = matkul;
    }



    @Override
    public Double getNilaiAkhir(int kodeMK) {
        MatkulAmbil matkulIni = null;
        for(MatkulAmbil matakuliah : matkul){
            if(matakuliah.getMataKuliah().getKode() == kodeMK){
                matkulIni = matakuliah;
                break;
            }
        }
        if(matkulIni != null){
            return (matkulIni.getN1() + matkulIni.getN2() + matkulIni.getN3())/3.0;
        }else{
            return 0.0;
        }
    }


    @Override
    public String toString() {
        return super.toString() + "\n" + matkul.toString();
    }

}
