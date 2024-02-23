public class Main {
    public static Hero[]createHeroes() {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Hero(300, 100, "Immortality");
        heroes[1] = new Hero(250, 50);
        heroes[2] = new Hero(350, 25, "Shape transformer");

        return heroes;
    }
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(400);
        boss.setDamage(75);
        boss.setDefenseType(" Super armor");

        System.out.println("Boss Information:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());

        Hero[] heros = createHeroes();



        System.out.println("Heroes Information:");
        for (int i = 0; i < heros.length; i++) {
            System.out.println("Hero " + (i + 1) + " Health: " + heros[i].getHealth());
            System.out.println("Hero " + (i + 1) + " Damage: " + heros[i].getDamage());
            System.out.println("Hero " + (i + 1) + " Super ability: " + heros[i].getSuperAbility());
            System.out.println();



    }


    }
}