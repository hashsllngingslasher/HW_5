public class Main {
    public static void main(String[] args) {
        Boss eyeOfCthulhu = new Boss();
        eyeOfCthulhu.setHealth(500);
        eyeOfCthulhu.setDamage(30);
        eyeOfCthulhu.setResistanceType("Range Damage");
        System.out.println("Eye of Cthulhu"
                + "\n" + "HP: " + eyeOfCthulhu.getHealth()
                + "\n" + "Damage: " + eyeOfCthulhu.getDamage()
                + "\n" + "Resist: " + eyeOfCthulhu.getResistanceType()
                + "\n" + "- - - - - - - - - - - -");

        Hero[] heroes = createHeroes();
        for (int i = 0; i < heroes.length; i++) {
            Hero hero = heroes[i];
            int heroNumber = i + 1;

            System.out.println("Hero #" + heroNumber
                    + "\n" + "Health: " + hero.getHealth()
                    + "\n" + "Damage: " + hero.getDamage()
                    + "\n" + "Super power: " + hero.getSuperPower()
                    + "\n" + "-----------------------");
        }
    }

    public static Hero[] createHeroes() {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Hero(150, 15);
        heroes[1] = new Hero(120, 10, "Range");
        heroes[2] = new Hero(100, 20, "Magic");
        return heroes;
    }
}