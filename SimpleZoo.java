public class SimpleZoo {
    public static void main(String[] args) {

        Animal lion = new Lion("Лео");

        Caretaker zookeeper = new Zookeeper("Вася");

        Animal[] animals = {lion};
        Zoo zoo = new Zoo(animals, zookeeper);

        zoo.startShow();
    }
}
