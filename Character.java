public abstract class Character {
    protected AttackStrategy attackStrategy;
    protected DefenseStrategy defenseStrategy;

    public Character(AttackStrategy attackStrategy, DefenseStrategy defenseStrategy) {
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;
    }

    public void performAttack() {
        attackStrategy.attack();
    }

    public void performDefense() {
        defenseStrategy.defend();
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setDefenseStrategy(DefenseStrategy defenseStrategy) {
        this.defenseStrategy = defenseStrategy;
    }
}