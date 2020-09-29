public class Animal {

    String name;
    double weight;

    public Animal(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return(name);
    }
    public double getWeight(){
        return(weight);
    }

    public void setName(String newName){
        this.name = newName;
    }
    public void setWeight(double newWeight){
        this.weight = newWeight;
    }
}
