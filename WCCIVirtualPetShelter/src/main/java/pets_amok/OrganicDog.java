package pets_amok;

public class OrganicDog extends OrganicAnimal implements Dog {
    int cage;

    public OrganicDog(String name, String description) {
        super(name, description);
    }

    public int getCage() {
        return this.cage;
    }

    public void setCage(int cage) {
        this.cage = cage;
    }

    public void cleanCage() {
        this.cage = 100;
    }

    public void calculateHappiness() {
        this.setHappiness(
                this.getBladder() + this.getExercise() + this.getHunger() + this.getThirst() + this.getCage());
    }

    public void walkDog() {
        this.setExercise(100);
        this.setBladder(100);
    }

    public int tick() {
        this.setBladder(this.getBladder() - 10);
        this.setExercise(this.getExercise() - 5);
        this.setHunger(this.getHunger() - 5);
        this.setThirst(this.getThirst() - 10);
        this.calculateHappiness();
        if (this.getBladder() == 0) {
            this.cage = this.cage - 10;
            this.setBladder(100);
            return 10;
        } else {
            return 0;
        }
    }
}