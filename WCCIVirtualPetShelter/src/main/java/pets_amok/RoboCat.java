package pets_amok;

public class RoboCat extends RoboticAnimal implements Cat {

    public RoboCat(String name, String description) {
        super(name, description);
    }

    public void calculateHappiness() {
        this.setHappiness(
                this.getBladder() + this.getExercise() + this.getOil());
    }

    public int tick() {
        this.setBladder(this.getBladder() - 10);
        this.setExercise(this.getExercise() - 5);
        this.setOil(this.getOil() - 10);
        this.calculateHappiness();
        if (this.getBladder() == 0) {
            this.setBladder(100);
            return 10;
        } else {
            return 0;
        }
    }
}