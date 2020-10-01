public class Dog extends Animal {


    public Dog(String name, double weight) {
        super(name, weight);
    }

    public double feed() {
        return (this.weight * 1000 / 100);
    }
}