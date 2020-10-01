public class Cat implements Animal {

    String name;
    double weight;

    public Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return (this.name);
    }

    public double feed(){
        return (this.weight * 1000 / 150);
    }
}
