package pets_amok;

public class OrganicCat extends OrganicAnimal implements Cat {

    public OrganicCat(String name, String description) {
        super(name, description);
    }

    public void calculateHappiness() {
        this.setHappiness(
                this.getBladder() + this.getExercise() + this.getHunger() + this.getThirst());
    }

    public int tick() {
        this.setBladder(this.getBladder() - 10);
        this.setExercise(this.getExercise() - 5);
        this.setHunger(this.getHunger() - 5);
        this.setThirst(this.getThirst() - 10);
        this.calculateHappiness();
        if (this.getBladder() < 0) {
            this.setBladder(100);
            return 10;
        } else {
            return 0;
        }
    }
}