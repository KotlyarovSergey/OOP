public class Turtle extends Animal {
    private int maxSpeed;
    public Turtle(String animalName, String ownerName, String diagnosis, Boolean isVaccinated, int maxSpeed) {
        super(animalName, ownerName, diagnosis, isVaccinated);
        this.maxSpeed = maxSpeed;
    }

    public Turtle() {
        this("Тортила", null, null, false, 1);
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void fly(){
        System.out.println("Я не умею летать!");
    }

}
