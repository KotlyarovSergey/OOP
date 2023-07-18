package Practice02_1807;

public class Doctor extends Human implements Healable {
    protected String name;

    public String getName() {
        return name;
    }

    public Doctor(String name) {
        this.name = name;
    }

    @Override
    public void toHeal(Animal patient) {
        System.out.printf("Я доктор. Я лечу %s\n", patient.TYPE);
    }

    public void inspection(Animal patient){
        System.out.println("Произвожу осмотр \"" + patient.getName() + "\"");
    }

    @Override
    public String toString(){
        return "Доктор " + this.name;
    }

}
