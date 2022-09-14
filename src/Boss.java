public class Boss {
    private int Health;
    private int Hit;
    private String SuperPower;

    public int getHealth() {
        return this.Health;
    }

    public int getHit() {
        return this.Hit;
    }

    public String getSuperPower() {
        return SuperPower;
    }

    public int setHealth(int Health) {
        this.Health = Health;
        return Health;
    }

    public int setHit(int Hit) {
        this.Hit = Hit;
        return Hit;
    }

    public String setSuperPower(String SuperPower) {
        this.SuperPower = SuperPower;
        return SuperPower;
    }


}
