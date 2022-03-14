package javaTask02;

public class MyFarm {
    public static void main(String[] args) {
        Cat pet1 = new Cat("Оли", 1);
        Dog pet2 = new Dog("Биг", 8);
        Parrot pet3 = new Parrot("Гоша", 3);

        pet1.eat();
        pet1.say();

        pet2.eat();
        pet2.say();
        System.out.println(pet2.getName());
        pet2.setName("Геральт");
        System.out.println(pet2.getName());
        pet2.getColor();

        pet3.eat();
        pet3.say();
        pet3.getColor();
        System.out.println(pet3.getAge());
    }
}
