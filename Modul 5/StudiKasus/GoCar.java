package StudiKasus;
public class GoCar extends Kendaraan {

    public GoCar() { this.jenisLayanan = "GoCar"; }

    @Override
    public double hitungOngkos(double jarak) {
        return jarak * 4000; 
    }

    @Override
    public void pesan() {
        System.out.println("GoCar dipesan. Mobil sedang menuju lokasi Anda.");
    }
}
