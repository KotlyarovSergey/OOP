package Practice02_1807;

public class Animal implements Illable {
    private String name;
    private String owner;
    protected final String TYPE = getClass().getSimpleName();

    public Animal(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getType(){
        return TYPE;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void ill() {
        System.out.println("Животное болеет");
    }

    @Override
    public String toString(){
        return String.format("%s \"%s\", хозяин: \"%s\"", TYPE, name, owner);
    }
}