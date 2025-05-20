import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Animal dog1 = new Dog("Totó", 2, true);
        Animal cat1 = new Cat("Black", 4, true);

        ArrayList<Animal> listAnimals = new ArrayList<>();
        listAnimals.add(dog1);
        listAnimals.add(cat1);

        for (Animal item : listAnimals) {
            System.out.println(item.toString());
            item.som();
            item.mover();
        }
    }
}