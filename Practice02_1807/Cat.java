package Practice02_1807;

public class Cat extends Animal implements Soundable, Runnable{
    private int speed;

    public Cat(String name, String owner, int speed) {
        super(name, owner);
        this.speed = speed;
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void ill()    {
        System.out.println("кошечка болеет");
    }

    @Override
    public void run() {
        System.out.println("Кошечка бежит");
    }

    @Override
    public int getRunSpeed() {
        return speed;
    }
}
