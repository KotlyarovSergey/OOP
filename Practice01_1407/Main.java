import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal barsik = new Animal("Барсик", "Ольга", "простуда", false);

        System.out.println(barsik.isVaccinated());
        barsik.setVaccinated(true);
        System.out.println(barsik.isVaccinated());
        System.out.println(barsik.getType());
        Cat cat = new Cat();

        System.out.println(cat);

        Animal musya = new Cat();
        Dog pes = new Dog();
        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(barsik);
        animals.add(pes);
        // System.out.println(animals);

        // System.out.println(musya.getType());
        // System.out.println(musya.getType("C arg "));
        cat.hunt();

    }
}
