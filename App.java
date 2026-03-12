import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Mobil m1 = new Mobil();
        m1.setKecepatan(50);

        System.out.print("Masukkan merk mobil 1: ");
        m1.setMerk(input.nextLine());

        System.out.print("Masukkan nomor polisi mobil 1: ");
        m1.setNopol(input.nextLine());

        m1.setWarna("Merah");
        m1.display();
        System.out.println("Jarak tempuh m1: " + m1.hitungJarak(2) + " km");
        System.out.println("---------------");

        Mobil m2 = new Mobil();
        m2.setKecepatan(100);

        System.out.print("Masukkan merk mobil 2: ");
        m2.setMerk(input.nextLine());

        System.out.print("Masukkan nomor polisi mobil 2: ");
        m2.setNopol(input.nextLine());

        m2.setWarna("Biru");
        m2.display();
        System.out.println("Jarak tempuh m2: " + m2.hitungJarak(2) + " km");
        System.out.println("---------------");

        System.out.println("Atribut pada objek m1 diubah.");

        m1.setWarna("Hijau");

        m1.display();
        m1.tampilKecepatanMPS();
        System.out.println("Jarak tempuh m1: " + m1.hitungJarak(2) + " km");
    }
}
