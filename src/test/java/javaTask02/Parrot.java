package javaTask02;

public class Parrot extends Animals implements AnimalColor{
    public Parrot(String name, int age) {
        super(name, age);
    }

    public void say(){
        System.out.println("Гоша хороший");
    }

    @Override
    public void getColor() {
        System.out.println("Зеленый");
    }
}
