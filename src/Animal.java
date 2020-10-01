public class Animal implements IFood {

    String name;
    double weight;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return (this.name);
    }

    public double feed() {
        return (0);
    }
}
