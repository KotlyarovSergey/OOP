package Practice02_1807;

public class Nurse extends Human {
    protected String name;
    public Nurse(String name) {
        this.name = name;
    }

    public void toDoBandage(Animal animal){
        if(animal instanceof Fish){
            System.out.println("Рыбок не перевязываем. Извините!");
        }else{
            System.out.println("Делаю перевязку " + animal.getName() + ".");
        }
    }

    public String getRecipe(Animal animal){
        return "Вот ваш рецепт для " + animal.TYPE + " " + animal.getName();
    }

    @Override
    public String toString(){
        return "Медсестра " + this.name;
    }
}
