import java.util.Scanner;
public class PemilihanPercobaan122 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner (System.in);
        System.out.print("Masukkan angka:  ");
        int angka = input22.nextInt();
        String hasil;
        hasil = (angka % 2 == 0) ? " bilangan ganjil " : " bilangan genap ";
        System.out.println ("Angka" + angka + hasil);
    }
}