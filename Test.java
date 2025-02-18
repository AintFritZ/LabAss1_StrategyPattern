public class Test {
    public static void main(String[] args) {
        Character knight = new Knight();
        Character wizard = new Wizard();
        Character archer = new Archer();

        System.out.println("Knight:");
        knight.performAttack();
        knight.performDefense();

        System.out.println("\nWizard:");
        wizard.performAttack();
        wizard.performDefense();

        System.out.println("\nArcher:");
        archer.performAttack();
        archer.performDefense();

        System.out.println("\nKnight switches to Dodge:");
        knight.setDefenseStrategy(new Dodge());
        knight.performDefense();
    }
}