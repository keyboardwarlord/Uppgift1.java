import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Object> animals = new ArrayList<>();

        animals.add(new Dog("Sixten", 5));
        animals.add(new Dog("Dogge", 10));
        animals.add(new Cat("Venus", 5));
        animals.add(new Cat("Ove", 3));
        animals.add(new Snake("Hypno", 1));

    }
}
