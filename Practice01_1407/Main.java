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
        System.out.println();

        Owl sovka = new Owl("Совка", "Серёжа", "Здорова", false, 4.3f);
        System.out.println(sovka);
        sovka.fly();
        sovka.swim();

        Mouse jerry = new Mouse("Джери", "Серёжа", "Обжорство", true, "brown");
        System.out.println(jerry);
        jerry.toGo();
        jerry.fly();

        Turtle mikkey = new Turtle("Микеланджело", "Серёжа", "Зеленуха", false, 7);
        System.out.println(mikkey);
        mikkey.swim();
        mikkey.fly();

    }
}
