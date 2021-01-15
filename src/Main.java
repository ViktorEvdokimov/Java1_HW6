public class Main {

    public static void main(String[] args) {
//        int animalQuantity = 0;
//        int dogQuantity = 0;
//        int catQuantity = 0;
        Animal[] pets = new Animal[3];
        pets[0] = new Dog("dogBobic");
        pets[0].printAnimalQuantity();
        pets[0].printQuantity();
        pets[1] = new Dog("dogTuzic");
        pets[1].printAnimalQuantity();
        pets[1].printQuantity();
        pets[2] = new Cat("catMurka");
        pets[2].printAnimalQuantity();
        pets[2].printQuantity();
        for (int i=0; i<pets.length; i++){
            pets[i].run(300);
            pets[i].run(550);
            pets[i].swim(5);
            pets[i].swim(15);
        }
    }
}
