import javax.swing.*;

public class Dog extends Animal {

    public Dog(String name, double weight) {
        super(name, weight);
    }

    public void feed(){
        JOptionPane.showMessageDialog(null, "Give the dog " + this.weight * 1000 / 100 + " grams of dog food");
    }
}
