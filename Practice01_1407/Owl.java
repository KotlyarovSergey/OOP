public class Owl extends Animal {
    private float eyesDiameter;

    public Owl(String animalName, String ownerName, String diagnosis, Boolean isVaccinated, float eyesDiameter) {
        super(animalName, ownerName, diagnosis, isVaccinated);
        this.eyesDiameter = eyesDiameter;
    }
    
    public float getEyesDiameter() {
        return eyesDiameter;
    }
    
    @Override
    public void swim(){
        System.out.println("Я не умею плавать!");
    }
}
