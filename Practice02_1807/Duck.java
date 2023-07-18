package Practice02_1807;

public class Duck extends Animal implements Soundable, Flyable, Runnable, Swimable {
    private int flySpeed;
    private int runSpeed;
    private int swimSpeed;

    public Duck(String name, String owner, int flySpeed, int runSpeed, int swimSpeed) {
        super(name, owner);
        this.runSpeed = runSpeed;
        this.flySpeed = flySpeed;
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void sound() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        // System.out.println(getClass().getName() + " is flying");
        System.out.println(TYPE + " is flying");
    }

    @Override
    public int getFlySpeed() {
        return flySpeed;
    }

    @Override
    public void run() {
        System.out.println(TYPE + " is run");
    }

    @Override
    public int getRunSpeed() {
        return runSpeed;
    }

    @Override
    public void swim() {
        System.out.println("Duck плывёт");
    }

    @Override
    public int getSwimSpeed() {
        return swimSpeed;
    }
}
