public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(90);
        boss.setHit(120);
        boss.setSuperPower("Knife");

        System.out.println(boss.getHealth() + ", " + boss.getHit() + ", " + boss.getSuperPower());
    }

}

