package StudiKasus;
public class GoTruck extends Kendaraan {

    public GoTruck() { this.jenisLayanan = "GoTruck"; }

    @Override
    public double hitungOngkos(double jarak) {
        return jarak * 8000;
    }

    @Override
    public void pesan() {
        System.out.println("GoTruck dipesan. Truk sedang menuju lokasi Anda.");
    }
}
