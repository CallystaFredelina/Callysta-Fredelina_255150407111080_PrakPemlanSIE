package Game;
public class NonPlayableChar extends Character {
    public NonPlayableChar(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("NPC " + this.name + " is just standing here...");
    }
}