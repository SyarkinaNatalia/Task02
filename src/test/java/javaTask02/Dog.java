package javaTask02;

public class Dog extends Animals implements AnimalColor{
    public Dog(String name, int age) {
        super(name, age);
    }

    public void say(){
        System.out.println("Гав");
    }

    @Override
    public void getColor() {
        System.out.println("Черная");
    }
}
