package Practice02_1807;

public class Fish extends Animal implements Swimable {
    private int swimSpeed;
    public Fish(String name, String owner, int swimSpeed) {
        super(name, owner);
        this.swimSpeed = swimSpeed;
    }
    @Override
    public void swim() {
        System.out.println("Рыбка плывёт");
    }
    @Override
    public int getSwimSpeed() {
        return swimSpeed;
    }

}
