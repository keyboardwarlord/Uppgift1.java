import javax.swing.*;

public class Cat extends Animal {

    public Cat(String name, double weight) {
        super(name, weight);
    }

    public void feed(){
        JOptionPane.showMessageDialog(null, "Give the cat " + this.weight * 1000 / 150 + " grams of cat food");
    }
}
