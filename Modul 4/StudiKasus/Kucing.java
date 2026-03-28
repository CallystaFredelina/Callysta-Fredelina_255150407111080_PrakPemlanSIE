package StudiKasus; 
public class Kucing extends Hewan {
    
    public Kucing(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Meooong!");
    }
}