public class GeometriApp {
    public static void main(String[] args) {
        Lingkaran lingKecil = new Lingkaran(2.0f);
        Lingkaran lingBesar = new Lingkaran(11.0f);

        float lK = lingKecil.luas(lingKecil.r);
        float lB = lingBesar.luas(lingKecil.r);

        float kK = Lingkaran.keliling(lingKecil.r);
        float kB = Lingkaran.keliling(lingBesar.r);

        System.out.println("Luas Lingkaran Kecil: " + lK);
        System.out.println("Luas Lingkaran Besar: " + lB);
    }
    
}
