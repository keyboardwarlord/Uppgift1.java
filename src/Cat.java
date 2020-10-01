public class Cat extends Animal implements Feeder{


    public Cat(String name, double weight) {
        super(name, weight);
    }



    public double feed(){
        return (this.weight * 1000 / 150);
    }
}
