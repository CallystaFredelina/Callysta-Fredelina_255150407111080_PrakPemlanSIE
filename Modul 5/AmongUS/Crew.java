package AmongUS;
public class Crew implements ICrew {
    private String name;
    private boolean isAlive; // penanda hidup atau mati

    public Crew(String name) {
        this.name = name;
        this.isAlive = true; // saat dibuat, Crew masih hidup
    }

    @Override
    public void doWork() {
        System.out.println("Crew " + this.name + " is doing work.");
    }

    @Override
    public String getName() { 
        return this.name; 
    }

    // method untuk menandai Crew sudah mati
    public void setDead() {
        this.isAlive = false;
    }

    public void callMeeting() {
        // cek apakah Crew masih hidup sebelum memanggil meeting
        if (!isAlive) {
            System.out.println(this.name 
                + " is dead and cannot call a meeting!");
            return; // langsung berhenti, tidak lanjut ke bawah
        }
        // jika masih hidup, baru boleh memanggil meeting
        System.out.print(this.name + " found a corpse ");
        System.out.print("and calls a meeting. ");
        System.out.println("Let's find the impostor!");
    }
}