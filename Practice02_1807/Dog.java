package Practice02_1807;

public class Dog extends Animal implements Soundable, Runnable, Swimable {
    private int runSpeed;
    private int swimSpeed;
    public Dog(String name, String owner, int runSpeed, int swimSpeed) {
        super(name, owner);
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void sound() {
        System.out.println("Woof");
    }

    @Override
    public void swim() {
        System.out.println("Собак плывёт.");
    }

    @Override
    public int getSwimSpeed() {
        return this.swimSpeed;
    }

    @Override
    public void run() {
        System.out.println("Пёсель бежит");
    }

    @Override
    public int getRunSpeed() {
        return runSpeed;
    }


}
