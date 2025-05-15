public class Grape extends Animal {
    private int lemonPower;

    public Grape(String name, String color, int lemonPower) {
        super(name, color);
        this.lemonPower = lemonPower;
    }

    public int getLemonPower() {
        return lemonPower;
    }
}