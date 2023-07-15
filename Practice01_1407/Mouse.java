public class Mouse extends Animal {
    private String color;

    public Mouse(String animalName, String ownerName, String diagnosis, Boolean isVaccinated, String color) {
        super(animalName, ownerName, diagnosis, isVaccinated);
        this.color = color;
    }

    public Mouse(){
        this("Шуша", null, null, false, "grey");
    }

    public String getColor() {
        return color;
    }

    @Override
    public void fly(){
        System.out.println("Я не умею летать!");
    }
}
