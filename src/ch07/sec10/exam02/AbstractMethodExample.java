package ch07.sec10.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        System.out.println();

        //매개변수를 이용해서 다형성을 구현
        animalSound(new Dog());
        animalSound(new Cat());
    }

    public static void animalSound(Animal animal) { //Animal animal = new Dog()
        animal.sound();
    }
}
