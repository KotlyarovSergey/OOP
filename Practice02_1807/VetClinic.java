package Practice02_1807;

import java.util.ArrayList;
// import java.util.LinkedList;
import java.util.List;

public class VetClinic {
    private final List<Animal> animals;
    
    public VetClinic() {
        animals = new ArrayList<>();
    }
    
    public VetClinic addAnimal(Animal animal){
        animals.add(animal);
        return this;
    }
    
    public List<Animal> getAnimals() {
        return animals;
    }
    
    public List<Animal> getFlyingAnimals(){
        List<Animal> flyings = new ArrayList<>();
        // List<Fliable> flyins = new ArrayList<>();
        for (Animal animal : animals) {
            if(animal instanceof Flyable){
                flyings.add(animal);
                // flyins.add((Fliable)animal);
            }
        }
        return flyings;
    }

    public List<Animal> getRunningAnimals(){
        List<Animal> runings = new ArrayList<>();
        for (Animal animal : animals) {
            if(animal instanceof Runnable){
                runings.add(animal);
            }
        }
        return runings;
    }

    public List<Animal> getSwimingAnimals(){
        List<Animal> swimings = new ArrayList<>();
        for (Animal animal : animals) {
            if(animal instanceof Swimable){
                swimings.add(animal);
            }
        }
        return swimings;
    }

    public List<Animal> getSoundableAnimals(){
        List<Animal> soundable = new ArrayList<>();
        for (Animal animal : animals) {
            if(animal instanceof Soundable){
                soundable.add(animal);
            }
        }
        return soundable;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for (Animal animal : animals) {
            builder.append("{").append(animal.TYPE).append(" \"").append(animal.getName());
            builder.append("\", хозяин: \"").append(animal.getOwner()).append("\"}\n");
            // builder.append(String.format("{%s \"%s\", хозяин: \"%s\"}\n",animal.TYPE, animal.getName(), animal.getOwner()));
        }
        return builder.toString();
    }



}
