package Practice02_1807;

public class Surgeon extends Doctor {
    
    public Surgeon(String name) {
        super(name);
    }

    @Override
    public void toHeal(Animal animal){
        System.out.println("Оперирую " + animal.getName() + "!");
    }

    @Override
    public String toString(){
        return "Хирург " + this.name;
    }
}
