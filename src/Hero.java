public class Hero {
    private int Health;
    private int Hit;
    private String superPower;

    public int getHealth() {
        return this.Health;
    }

    public int getHit() {
        return this.Hit;
    }

    public String getSuperPower() {
        return this.superPower;
    }

    public Hero(int Health, int Hit, String superPower) {
        this.Health = Health;
        this.Hit = Hit;
        this.superPower = superPower;
    }

    public Hero(int Health, int Hit) {
        this.Health = Health;
        this.Hit = Hit;
    }

}


