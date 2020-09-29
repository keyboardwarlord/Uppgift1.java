import javax.swing.*;

public class Snake extends Animal {

    public Snake(String name, double weight) {
        super(name, weight);
    }

    public void feed(){
        JOptionPane.showMessageDialog(null, "Give the snake 20 grams of snake pellets");
    }
}
