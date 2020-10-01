import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Dog("Sixten", 5));
        animals.add(new Dog("Dogge", 10));
        animals.add(new Cat("Venus", 5));
        animals.add(new Cat("Ove", 3));
        animals.add(new Snake("Hypno", 1));

        //IFood x = new Dog("er", 2);
        //System.out.println(x.feed());

        String animalToFeed = JOptionPane.showInputDialog("What animal do you want to feed");
        boolean animalFound = false;
        for (int i = 0; i < animals.toArray().length; i++) {
            if (animalToFeed.toLowerCase().equals(animals.get(i).getName().toLowerCase())){
                JOptionPane.showMessageDialog(null, "Give " + animals.get(i).getName() + " " +
                        animals.get(i).feed() +  " grams of " +
                        animals.get(i).getClass().getName().toLowerCase() + " food");
                animalFound = true;
            }
            if (animalFound){
                break;
            }
            else if (i == animals.toArray().length-1){
                JOptionPane.showMessageDialog(null, "Animal not found");
            }
        }



    }
}
