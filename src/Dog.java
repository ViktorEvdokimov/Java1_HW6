public class Dog extends Animal{
    private int dogQuantity = 0;
    public Dog(String name) {
        super(name);
        dogQuantity++;
    }
    @Override
    public void run (int distance){
        if (distance<500) System.out.println(getName() + "пробежал" + distance);
        else System.out.println(getName() + "не может бежать так далеко");

    }
    @Override
    public void swim (int distance){
        if (distance<200) System.out.println(getName() + "проплыл" + distance);
        else System.out.println(getName() + "не может плыть так далеко");

    }
    public void quantity(){
        System.out.println("Бфло созданно " + dogQuantity + " собак.");
    }
}
