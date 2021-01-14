public abstract class Animal {
    private int animalQuantity = 0;
    private String name;

    public abstract void run();
    public abstract void swim();

    public Animal(String name) {
        this.name = name;
        animalQuantity++;
    }

    public int getAnimalQuantity() {
        return animalQuantity;
    }
}
