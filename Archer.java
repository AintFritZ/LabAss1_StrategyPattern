public class Archer extends Character {
    public Archer() {
        super(new ShootArrow(), new Dodge()); // Default strategies
    }
}