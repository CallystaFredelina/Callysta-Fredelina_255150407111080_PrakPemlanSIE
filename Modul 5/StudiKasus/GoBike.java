package StudiKasus;
public class GoBike extends Kendaraan {

    public GoBike() { this.jenisLayanan = "GoBike"; }

    @Override
    public double hitungOngkos(double jarak) {
        return jarak * 2000; 
    }

    @Override
    public void pesan() {
        System.out.println("GoBike dipesan. Motor sedang menuju lokasi Anda.");
    }
}
