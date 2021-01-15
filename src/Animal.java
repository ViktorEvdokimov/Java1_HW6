public abstract class Animal {
    private static int animalQuantity = 0;
    private String name;

     public abstract void swim(int distance);

    public abstract void run(int distance);

    public abstract void printQuantity();

    public Animal(String name) {
        this.name = name;
        animalQuantity++;
 //       return animalQuantity;
    }

    public void printAnimalQuantity() {
        System.out.println("Было созданно " + animalQuantity + " животных.");
    }


    public String getName() {
        return name;
    }
}
