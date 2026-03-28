package StudiKasus;
public class Anjing extends Hewan {
    
    public Anjing(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Guk guk!");
    }
} 