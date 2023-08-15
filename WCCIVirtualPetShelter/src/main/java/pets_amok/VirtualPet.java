package pets_amok;

public abstract class VirtualPet {
    private String name;
    private String description;
    private int happiness;
    private int hunger;
    private int thirst;
    private int bladder;
    private int exercise;

    // constructors
    public VirtualPet() {
    }

    public VirtualPet(String name, String description) {
        this.name = name;
        this.description = description;
        this.hunger = 100;
        this.thirst = 100;
        this.exercise = 100;
        this.bladder = 100;

    }

    // getters/setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHappiness() {
        return this.happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getBladder() {
        return this.bladder;
    }

    public void setBladder(int bladder) {
        this.bladder = bladder;
    }

    public int getExercise() {
        return this.exercise;
    }

    public void setExercise(int exercise) {
        this.exercise = exercise;
    }

    public void exercise() {
        this.exercise = 100;
        this.thirst = this.thirst - 30;
        this.hunger = this.hunger - 10;
    }

    public void bathroom() {
        this.bladder = 100;
    }

    public abstract void calculateHappiness();

    public abstract int tick();
}
