public class MatkulPilihan extends MataKuliah {
    private int jumlahMinimum;

    public MatkulPilihan(int kode, int sks, String nama, int jumlahMinimum) {
        super(kode, sks, nama);
        this.jumlahMinimum = jumlahMinimum;    
    }

    public MatkulPilihan() {
        super();
        jumlahMinimum = 0;
    }

    public void setJumlahMinimum(int jumlahMinimum) {
        this.jumlahMinimum = jumlahMinimum;
    }

    public int getJumlahMinimum() {
        return jumlahMinimum;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJumlah Minimum: " + jumlahMinimum;
    }

}
