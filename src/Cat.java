public class Cat extends Animal{
    private static int catQuantity = 0;
    public Cat(String name) {
        super(name);
        catQuantity++;
    }
    @Override
    public void run (int distance){
        if (distance<200) System.out.println(getName() + " пробежал " + distance);
        else System.out.println(getName() + " не может бежать так далеко");

    }
    @Override
    public void swim (int distance){
        System.out.println(getName() + " не умеет плавать ");

    }
    public void printQuantity(){
        System.out.println("Было созданно " + catQuantity + " кошек.");
    }
}

