package Lesson_5;

public class Main {

    public static void main(String[] args) {
        Dog d = new Dog("Boss", 500, 100, 0.5f);
        Horse h = new Horse("Gram", 1500, 100, 3);
        Bird b = new Bird("Pop", 5, false, 0.2f);
        Cat c = new Cat("Barsik", 200, false, 2);
        d.InfDog();
        h.InfHorse();
        b.InfBird();
        c.InfCat();
    }
}
