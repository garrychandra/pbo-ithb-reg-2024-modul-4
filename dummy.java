import java.sql.Date;
import java.sql.Time;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class dummy {
    public static void main(String[] args) {

        Presensi presensi = new Presensi(new Date(0), 1);
        PresensiStaff presensiStaff = new PresensiStaff(new Date(System.currentTimeMillis()), 0, new Time(System.currentTimeMillis()));

        MataKuliah mataKuliah = new MataKuliah(12345, 4, "pbo");
        MatkulPilihan matkulPilihan = new MatkulPilihan(54321, 4, "basdat", 9);

        MatkulAmbil matkulAmbil = new MatkulAmbil(mataKuliah, 100, 100, 100);
        matkulAmbil.getPresensi().add(presensi);
        matkulAmbil.getPresensi().add(new Presensi(new Date(System.currentTimeMillis()), Status.ALPHA));

        MatkulAjar matkulAjar = new MatkulAjar(mataKuliah);
        matkulAjar.getPresensi().add(presensiStaff);

        Sarjana sarjana = new Sarjana("garry", "dipatiukur", "jakarta 2 desember 1900", 123456, 654321, "informatika");
        sarjana.getMatkul().add(matkulAmbil);
        sarjana.getMatkul().add(new MatkulAmbil(matkulPilihan, 100, 100, 100));
        sarjana.getMatkul().get(1).getPresensi().add(new Presensi(new Date(0),Status.HADIR));

        Magister magister = new Magister("garry", "dipatiukur", "jakarta 2 desember 1900", 123456, 654321,
                "informatika", "tbd");
        magister.getMatkul().add(matkulAmbil);

        Doktor doktor = new Doktor("garry", "dipatiukur", "jakarta 2 desember 1900", 123456, 654321, "informatika",
                "tbd");
        doktor.setSidang1(100);

        DosenTetap dosenTetap = new DosenTetap("garry", "dipatiukur", "jakarta 2 desember 1900", 123456, 654321,
                "informatika", 1000);
        dosenTetap.getMatkulAjar().add(matkulAjar);

        DosenHonorer dosenHonorer = new DosenHonorer("garry", "dipatiukur", "jakarta 2 desember 1900", 123456, 654321,
                "informatika", 100);
        dosenHonorer.getMatkulAjar().add(matkulAjar);

        Karyawan karyawan = new Karyawan("garry", "dipatiukur", "jakarta 2 desember 1900", 123456, 654321, 1000);
        karyawan.getPresensiStaff().add(presensiStaff);

        List<SIA> people = new ArrayList<>();
        people.add(dosenHonorer);
        people.add(karyawan);
        people.add(doktor);
        people.add(magister);
        people.add(sarjana);
        
        
        
        String text;
        int n = JOptionPane.showConfirmDialog(null,
                        "Mau Print Status?",
                        "Print Status?",
                        JOptionPane.YES_NO_OPTION);

        if(n == JOptionPane.YES_OPTION){
                displayStatus(people);
        }


        
        
        
        //System.out.println(dosenTetap.getGaji());
/*/
        System.out.println("Sarjana\n" + sarjana +
                "\n\nMagister\n" + magister +
                "\n\nDoktor\n" + doktor +
                "\n\nDosen Tetap\n" + dosenTetap +
                "\n\nDosen Honorer\n" + dosenHonorer +
                "\n\nKaryawan\n" + karyawan +
                "\n\nMata Kuliah\n" + mataKuliah +
                "\n\nMata Kuliah Pilihan\n" + matkulPilihan +
                "\n\nMata Kuliah Diajar\n" + matkulAjar +
                "\n\nMata Kuliah Diambil\n" + matkulAmbil +
                "\n\nPresensi\n" + presensi +
                "\n\nPresensi Staff\n" + presensiStaff);
*/
    }

    static void displayStatus(List<SIA> people){
        String text = JOptionPane.showInputDialog("Enter Name: ");
        for(int i = 0; i < people.size(); i++){
                if(people.get(i).getNama().equals(text)){
                        JOptionPane.showMessageDialog(null, "Nama : " + people.get(i).getNama() + "\nStatus: " + people.get(i).getClass().getSimpleName());
                }
        }
    }
}
