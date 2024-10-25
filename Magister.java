import java.util.ArrayList;
import java.util.List;

public class Magister extends Mahasiswa implements MahasiswaMethod {

    private List<MatkulAmbil> matkul;
    private String judulPenelitian;

    public Magister(String nama, String alamat, String ttl, int noTelp, int nim, String jurusan,
            String judulPenelitian) {

        super(nama, alamat, ttl, noTelp, nim, jurusan);
        matkul = new ArrayList<>();
        this.judulPenelitian = judulPenelitian;
    }

    public Magister() {
        super();
        matkul = new ArrayList<>();
        judulPenelitian = "";
    }

    public List<MatkulAmbil> getMatkul() {
        return matkul;
    }

    public void setMatkul(List<MatkulAmbil> matkul) {
        this.matkul = matkul;
    }

    public String getJudulPenelitian() {
        return judulPenelitian;
    }

    public void setJudulPenelitian(String judulPenelitian) {
        this.judulPenelitian = judulPenelitian;
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
        return super.toString() + "\nMata Kuliah: " + matkul.toString() + "\nJudul Penelitian: " + judulPenelitian;
    }
}
