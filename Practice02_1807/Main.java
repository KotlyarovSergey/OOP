package Practice02_1807;

import java.util.List;

/**
 * Task1
 */
public class Main {
    public static void main(String[] args) {
        VetClinic clinic = new VetClinic();
        clinic.addAnimal(new Cat("кот", "человек", 34))
                .addAnimal(new Dog("пёс", "человек", 57, 12))
                .addAnimal(new Duck("утка", "человек", 101, 5, 15));

        System.out.println(clinic);
        System.out.println();
        clinic.addAnimal(new Cat("Мурзик", "Нина", 27))
                .addAnimal(new Dog("Барбос", "Нина", 64, 14))
                .addAnimal(new Cat("Барсик", "Баба Клава", 14))
                .addAnimal(new Duck("Скрудж", "Леночка", 80, 7, 19));
        System.out.println(clinic);
        System.out.println();

        List<Animal> flyingAnimals = clinic.getFlyingAnimals();
        System.out.println("Летающие пациенты:");
        for (Animal animal : flyingAnimals) {
            System.out.println(animal);
        }
        System.out.println();

        Dog sharik = new Dog("Шарик", "Афанасий Степанович", 62, 13);
        Doctor doc = new Doctor("Пилюлькин");
        System.out.println(doc);
        doc.inspection(sharik);
        doc.toHeal(sharik);
        System.out.println();

        Surgeon surgeon = new Surgeon("Селиванов А.Н.");
        System.out.println(surgeon);
        surgeon.inspection(sharik);
        surgeon.toHeal(sharik);
        System.out.println();

        Nurse nurse = new Nurse("Ирина Михайловна");
        System.out.println(nurse);
        nurse.toDoBandage(sharik);
        System.out.println(nurse.getRecipe(sharik));
        System.out.println();
        nurse.toDoBandage(new Fish("Глупик", "Паша", 50));
        System.out.println();


        clinic.addAnimal(sharik)
                .addAnimal(new Fish("Дори", "Катя", 136))
                .addAnimal(new Fish("Немо", "Катя", 120))
                .addAnimal(new Cat("Пушок", "Саша", 27))
                .addAnimal(new Dog("Каштанка", "Лука Александрыч", 55, 10))
                .addAnimal(new Duck("Кряква", "Галина", 85, 6, 18))
                .addAnimal(new Fish("Валерон", "Аня", 110));
        System.out.println("Все пациенты клиники:");
        System.out.println(clinic);

        List<Animal> soundableAnimals = clinic.getSoundableAnimals();
        System.out.println("Говорящие пациенты:");
        for (Animal animal : soundableAnimals) {
            System.out.println(animal);
        }
        System.out.println();

        List<Animal> runableAnimals = clinic.getRunningAnimals();
        System.out.println("Бегающие пациенты:");
        for (Animal animal : runableAnimals) {
            System.out.println(animal);
        }
        System.out.println();

        List<Animal> swimableAnimals = clinic.getSwimingAnimals();
        System.out.println("плавающие пациенты:");
        for (Animal animal : swimableAnimals) {
            System.out.println(animal);
        }
        System.out.println();

        

    }

}