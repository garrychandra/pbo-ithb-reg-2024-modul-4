import java.sql.Date;
import java.sql.Time;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class dummy {
    public static void main(String[] args) {

        Presensi presensi = new Presensi(new Date(0), 1);
        PresensiStaff presensiStaff = new PresensiStaff(new Date(System.currentTimeMillis()), 0, 0);

        MataKuliah mataKuliah = new MataKuliah(1, 4, "pbo");
        MatkulPilihan matkulPilihan = new MatkulPilihan(2, 4, "basdat", 9);

        MatkulAmbil matkulAmbil = new MatkulAmbil(mataKuliah, 100, 100, 100);
        matkulAmbil.getPresensi().add(presensi);
        matkulAmbil.getPresensi().add(new Presensi(new Date(System.currentTimeMillis()), Status.ALPHA));

        MatkulAjar matkulAjar = new MatkulAjar(mataKuliah);
        matkulAjar.getPresensi().add(presensiStaff);

        Sarjana sarjana = new Sarjana("garry", "dipatiukur", "jakarta 2 desember 1900", 123456, 1, "informatika");
        sarjana.getMatkul().add(matkulAmbil);
        sarjana.getMatkul().add(new MatkulAmbil(matkulPilihan, 100, 100, 100));
        sarjana.getMatkul().get(1).getPresensi().add(new Presensi(new Date(0),Status.HADIR));

        Magister magister = new Magister("Bobi", "dipatiukur", "jakarta 2 desember 1900", 123456, 2,
                "informatika", "tbd");
        magister.getMatkul().add(matkulAmbil);

        Doktor doktor = new Doktor("Zen", "dipatiukur", "jakarta 2 desember 1900", 123456, 3, "informatika",
                "tbd");
        doktor.setSidang1(100);

        DosenTetap dosenTetap = new DosenTetap("Ron", "dipatiukur", "jakarta 2 desember 1900", 123456, 1,
                "informatika", 1000);
        dosenTetap.getMatkulAjar().add(matkulAjar);

        DosenHonorer dosenHonorer = new DosenHonorer("Ben", "dipatiukur", "jakarta 2 desember 1900", 123456, 2,
                "informatika", 100);
        dosenHonorer.getMatkulAjar().add(matkulAjar);

        Karyawan karyawan = new Karyawan("Bob", "dipatiukur", "jakarta 2 desember 1900", 123456, 3, 1000);
        karyawan.getPresensiStaff().add(presensiStaff);

        List<SIA> people = new ArrayList<>();
        people.add(dosenHonorer);
        people.add(karyawan);
        people.add(doktor);
        people.add(magister);
        people.add(sarjana);

        List<Mahasiswa> mahasiswa = new ArrayList<>();
        mahasiswa.add(doktor);
        mahasiswa.add(magister);
        mahasiswa.add(sarjana);

        List<Dosen> dosen = new ArrayList<>();
        dosen.add(dosenHonorer);
        dosen.add(dosenTetap);

        List<MatkulAmbil> matkulAmbils = new ArrayList<>();
        matkulAmbils.add(matkulAmbil);
        
        
        int n = JOptionPane.showConfirmDialog(null,
                        "Mau Print Status?",
                        "Print Status?",
                        JOptionPane.YES_NO_OPTION);

        if(n == JOptionPane.YES_OPTION){
                displayStatus(people);
        }

        n = JOptionPane.showConfirmDialog(null,
                "Mau Nilai Akhir?",
                "Print Nilai Akhir?",
                JOptionPane.YES_NO_OPTION);
        
        if(n == JOptionPane.YES_OPTION){
                displayNilaiAkhir(mahasiswa);
                
        }

        n = JOptionPane.showConfirmDialog(null,
                "Print rata-rata Nilai Akhir?",
                "Print rata-tara Nilai Akhir?",
                JOptionPane.YES_NO_OPTION);

        if(n == JOptionPane.YES_OPTION){
                displayNilaiAkhirRata2(mahasiswa);
                
        }

        n = JOptionPane.showConfirmDialog(null,
                "Lihat berapa banyak mahasiswa tidak lulus?",
                "berapa banyak tidak lulus?",
                JOptionPane.YES_NO_OPTION);
        
        if(n == JOptionPane.YES_OPTION){
                displayGaLulus(mahasiswa);
                
        }

        n = JOptionPane.showConfirmDialog(null,
                "print matkul yang diambil mahasiswa tertentu?",
                "print matkul mahasiswa",
                JOptionPane.YES_NO_OPTION);
        
        if(n == JOptionPane.YES_OPTION){
                displayMatkulMhs(mahasiswa);
                
        }

        n = JOptionPane.showConfirmDialog(null,
                "print berapa jam seorang dosen mengajar?",
                "print dosen mengajar",
                JOptionPane.YES_NO_OPTION);
        
        if(n == JOptionPane.YES_OPTION){
                displayJamDosen(dosen);
                
        }

        n = JOptionPane.showConfirmDialog(null,
                "print gaji seorang staff?",
                "print gaji staff",
                JOptionPane.YES_NO_OPTION);
        
        if(n == JOptionPane.YES_OPTION){
                displayJamDosen(dosen);
                
        }
    }

    static void displayStatus(List<SIA> people){
        String text = JOptionPane.showInputDialog("Enter Name: ");
        boolean found = false;
        for(int i = 0; i < people.size(); i++){
                if(people.get(i).getNama().equals(text)){
                        JOptionPane.showMessageDialog(null, "Nama : " + people.get(i).getNama() + "\nStatus: " + people.get(i).getClass().getSimpleName());
                        found = true;
                }
        }
        if(!found){
                JOptionPane.showMessageDialog(null, "Nama tidak ketemu","Name not found",JOptionPane.ERROR_MESSAGE);
        }
    }

    static void displayNilaiAkhir(List<Mahasiswa> mahasiswa){
        String text = JOptionPane.showInputDialog("Enter NIM: ");
        int nim = Integer.parseInt(text);
        text = JOptionPane.showInputDialog("Enter Kode Mata Kuliah: ");
        int matkul = Integer.parseInt(text);
        Double nilaiAkhir = 0.0;
        for(int i = 0; i < mahasiswa.size(); i++){
                if(mahasiswa.get(i).getNIM() == nim){
                        if(mahasiswa.get(i) instanceof Sarjana){
                                Sarjana sarjana = (Sarjana) mahasiswa.get(i);
                                nilaiAkhir = sarjana.getNilaiAkhir(matkul);
                                
                        }
                        else if(mahasiswa.get(i) instanceof Magister){
                                Magister magister = (Magister) mahasiswa.get(i);
                                nilaiAkhir = magister.getNilaiAkhir(matkul);
                        } else{
                                Doktor doktor = (Doktor) mahasiswa.get(i);
                                nilaiAkhir = doktor.getNilaiAkhir(matkul);
                        }
                }
        }
        JOptionPane.showMessageDialog(null, "Nilai Akhir: " + nilaiAkhir);
    }

    static void displayNilaiAkhirRata2(List<Mahasiswa> mahasiswa){
        String text = JOptionPane.showInputDialog("Enter Kode Mata Kuliah: ");
        int matkul = Integer.parseInt(text);
        Double nilaiAkhir = 0.0;
        Double count = 0.0;

        for(int i = 0; i < mahasiswa.size();i++){
                Double temp = mahasiswa.get(i).getNilaiAkhir(matkul);
                if (temp != -1.0 && !(mahasiswa instanceof Doktor)) {
                        nilaiAkhir += temp;
                        count++;
                }
        }
        JOptionPane.showMessageDialog(null, "Rata-rata Nilai Akhir: " + nilaiAkhir/count);
    }

    static void displayGaLulus(List<Mahasiswa> mahasiswa){
        String matkulName = "";
        String text = JOptionPane.showInputDialog("Enter Kode Mata Kuliah: ");
        int matkul = Integer.parseInt(text);
        int count = 0;
        int countTotal = 0;
        
        for(Mahasiswa mhs: mahasiswa){
                Double nilaiAkhir = mhs.getNilaiAkhir(matkul);
                if(nilaiAkhir < 56 && nilaiAkhir >= 0 && !(mahasiswa instanceof Doktor)){
                        count++;
                        //get nama matkulnya sekali
                        if(matkulName.equals("")){
                                if(mhs instanceof Sarjana){
                                        for(int j = 0; j < ((Sarjana)mhs).getMatkul().size(); j++){
                                                if(((Sarjana)mhs).getMatkul().get(j).getMataKuliah().getKode() == matkul){
                                                        matkulName = ((Sarjana)mhs).getMatkul().get(j).getMataKuliah().getNama();
                                                }
                                                
                                        }
                                }
                                else if(mhs instanceof Magister){
                                        for(int j = 0; j < ((Magister)mhs).getMatkul().size(); j++){
                                                if(((Magister)mhs).getMatkul().get(j).getMataKuliah().getKode() == matkul){
                                                        matkulName = ((Magister)mhs).getMatkul().get(j).getMataKuliah().getNama();
                                                }
                                                
                                        }
                                }
                        }
                }
                countTotal++;
        }
        JOptionPane.showMessageDialog(null, count + " dari " + countTotal + " Mahasiswa tidak lulus matakuliah " + matkulName);
    }

    static void displayMatkulMhs(List<Mahasiswa> mahasiswa){
        String text = JOptionPane.showInputDialog("Enter Kode NIM: ");
        int nim = Integer.parseInt(text);
        Mahasiswa mhs = null;
        String output = "";

        //find mahasiswa with nim
        for(int i = 0; i < mahasiswa.size();i++){
                if(mahasiswa.get(i).getNIM() == nim){
                        mhs = mahasiswa.get(i);
                        break;
                }
        }

        if(mhs != null){
                List<MatkulAmbil> matkulAmbils;
                if(mhs instanceof Sarjana){
                        matkulAmbils = ((Sarjana)mhs).getMatkul();    
                } else if(mhs instanceof Magister){
                        matkulAmbils = ((Magister)mhs).getMatkul();    
                } else{
                        matkulAmbils = null;
                }
                
                //kalo bukan doktor
                if(matkulAmbils != null){
                        for(MatkulAmbil matkulIni : matkulAmbils){
                                output += "Mata Kuliah: " + matkulIni.getMataKuliah().getNama();

                                int countPresensi = 0;
                                int totalKelas = 0;
                                List<Presensi> presensi = matkulIni.getPresensi();
                                for(Presensi presensiThis: presensi){
                                        if(presensiThis.getStatus() == Status.HADIR){
                                                countPresensi++;
                                        }
                                        totalKelas++;
                                }
                                output += " Presensi: " + countPresensi + "/" + totalKelas + "\n";
                        }
                } else{// kalo doktor
                        output += "Doktor";
                }
                JOptionPane.showMessageDialog(null, output);
        } else{
                JOptionPane.showMessageDialog(null, "Mahasiswa tidak ketemu","no mhs", JOptionPane.ERROR_MESSAGE);
        }     
    }

    static void displayJamDosen(List<Dosen> listDosen){
        String text = JOptionPane.showInputDialog("Enter NIK: ");
        int nik = Integer.parseInt(text);
        Dosen dosen = null;
        int countHour = 0;

        for(int i = 0; i < listDosen.size();i++){
                if(listDosen.get(i).getnik() == nik){
                        dosen = listDosen.get(i);
                        break;
                }
        }

        if(dosen != null){
                List<MatkulAjar> listMatkulAjar = dosen.getMatkulAjar();
                for(MatkulAjar matkulAjar: listMatkulAjar){
                        for(PresensiStaff presensi: matkulAjar.getPresensi()){
                                if(presensi.getStatus() == Status.HADIR){
                                        countHour += presensi.getJam();
                                }
                        }
                }
                JOptionPane.showMessageDialog(null, "Jumlah jam yang diajar dosen " + dosen.getNama() + ": " + countHour);
        }
        else{
                JOptionPane.showMessageDialog(null, "Dosen tidak ketemu","no Dosen", JOptionPane.ERROR_MESSAGE);
        }     
    }


    static void displayGajiStaff(List<Staff> listStaff){
        String text = JOptionPane.showInputDialog("Enter NIK: ");
        int nik = Integer.parseInt(text);
        Staff staff = null;

        for(int i = 0; i < listStaff.size();i++){
                if(listStaff.get(i).getnik() == nik){
                        staff = listStaff.get(i);
                        break;
                }
        }

        if(staff != null){
                JOptionPane.showMessageDialog(null, "Jumlah gaji staff " + staff.getNama() + ": " + staff.getGaji());
        }
        else{
                JOptionPane.showMessageDialog(null, "Staff tidak ketemu","no Staff", JOptionPane.ERROR_MESSAGE);
        }     
    }
}

