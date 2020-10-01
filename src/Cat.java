public class Cat extends Animal{


    public Cat(String name, double weight) {
        super(name, weight);
    }

    @Override
    public double feed(){
        return (this.weight * 1000 / 150);
    }
}
