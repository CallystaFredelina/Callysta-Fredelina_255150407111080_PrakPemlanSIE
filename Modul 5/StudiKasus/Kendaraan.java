package StudiKasus;
public abstract class Kendaraan {
    protected String jenisLayanan;
    protected double jarak; 

    public abstract double hitungOngkos(double jarak);

    public abstract void pesan();

    public void selesaiPerjalanan(double jarak) {
        double ongkos = hitungOngkos(jarak);
        System.out.println("Perjalanan selesai!");
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("Total ongkos " + jenisLayanan 
                           + ": Rp" + ongkos);
    }
}
