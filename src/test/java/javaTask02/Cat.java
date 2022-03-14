package javaTask02;

public class Cat extends Animals implements AnimalColor{
    public Cat(String name, int age) {
        super(name, age);
    }

    public void say(){
        System.out.println("Мяу");
    }

    @Override
    public void getColor() {
        System.out.println("Рыжая");
    }
}
