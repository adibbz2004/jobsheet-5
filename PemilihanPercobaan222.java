import java.util.Scanner;
public class PemilihanPercobaan222 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        System.out.print("Nilai uas : ");
        float uas = input21.nextFloat();
        System.out.print("Nilai uts : ");
        float uts = input21.nextFloat();
        System.out.print("Nilai kuiz : ");
        float kuiz = input21.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input21.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuiz * 0.1F) + (tugas * 0.2F);
        // membuat variabel untuk nilai huruf, nilai setara, dan kualifikasi
        String nilaiHuruf;
        double nilaiSetara;
        String kualifikasi;
        //struktur pemilihan
        if (total > 80 && total <= 100) {
            nilaiHuruf = "A";
            nilaiSetara = 4;
            kualifikasi = "Sangat Baik";
        } else if (total > 73 && total <= 80) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "Lebih dari Baik";
        } else if (total > 65 && total <= 73) {
            nilaiHuruf = "B";
            nilaiSetara = 3;
            kualifikasi = "Baik";
        } else if (total > 60 && total <= 65) {
            nilaiHuruf = "C+" ;
            nilaiSetara = 2.5;
            kualifikasi = "Lebih dari cukup";
        } else if (total > 50 && total <= 60) {
            nilaiHuruf = "C";
            nilaiSetara = 2;
            kualifikasi = "Cukup";
        } else if (total > 39 && total <= 50) {
            nilaiHuruf = "D";
            nilaiSetara = 1;
            kualifikasi = "Kurang";
        } else if (total < 39) {
            nilaiHuruf = "E" ;
            nilaiSetara = 0;
            kualifikasi = "Gagal";
        }else{
            nilaiHuruf = "error";
            nilaiSetara = 00;
            kualifikasi = "error";
        }
        // mencetak variabel yang ada
        System.out.println("Nilai angka : " + total);
        System.out.println("Nilai huruf : " + nilaiHuruf);
        System.out.println("Nilai setara : " + nilaiSetara);
        System.out.println("Kualifikasi : " + kualifikasi);
    }
}
