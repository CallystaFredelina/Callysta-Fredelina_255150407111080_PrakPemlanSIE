package StudiKasus;
public class AplikasiTransportasi {
    public static void main(String[] args) {

        GoCar mobil = new GoCar();
        mobil.pesan();
        mobil.selesaiPerjalanan(10);

        System.out.println("------------------");

        GoBike motor = new GoBike();
        motor.pesan();
        motor.selesaiPerjalanan(10);

        System.out.println("------------------");

        GoTruck truk = new GoTruck();
        truk.pesan();
        truk.selesaiPerjalanan(10);
    }
}
