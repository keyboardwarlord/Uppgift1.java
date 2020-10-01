public class Snake implements Animal {

    String name;
    double weight;

    public Snake(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return (this.name);
    }

    @Override
    public double feed() {
        return (20);
    }
}