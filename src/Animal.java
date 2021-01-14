public abstract class Animal {
    private int animalQuantity = 0;
    private String name;

     public abstract void swim(int distance);

    public abstract void run(int distance);

    public abstract void quantity();

    public Animal(String name) {
        this.name = name;
        animalQuantity++;
    }

    public void animalQuantity(){
        System.out.println("Бфло созданно " + animalQuantity + " животных.");
    }

    public int getAnimalQuantity() {
        return animalQuantity;
    }

    public String getName() {
        return name;
    }
}
