//Придумать и реализовать любую модель предметной области,
//на полную использующую ООП. Минимум один абстрактный класс,
//минимум один интерфейс, каждая абстракция должна иметь минимум одного наследника.
abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public abstract void makeSound();
}


class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Рррр!");
    }
}


interface Caretaker {
    void careForAnimal(Animal animal);
}


class Zookeeper implements Caretaker {
    private String name;

    public Zookeeper(String name) {
        this.name = name;
    }

    @Override
    public void careForAnimal(Animal animal) {
        System.out.println(name + " заботится о " + animal.getName());
    }
}


class Zoo {
    private Animal[] animals;
    private Caretaker caretaker;

    public Zoo(Animal[] animals, Caretaker caretaker) {
        this.animals = animals;
        this.caretaker = caretaker;
    }

    public void startShow() {
        for (Animal animal : animals) {
            caretaker.careForAnimal(animal);
            animal.makeSound();
        }
    }
}