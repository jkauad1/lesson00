package src.comparassion.classes;

import java.util.Random;

public class Person implements Comparable <Person> {
    private String name;
    private int CPF;
    private int age;

    private static final String[] NAMES = {"Kauã", "Matheus", "Victor", "André", "Danilo", "Romero", "Andreza", "Ana", "Carla", "Maria"};
    private static final Random RANDOM = new Random();

    public Person(){}

    public String generateRandomName() {
        return NAMES[RANDOM.nextInt(NAMES.length)];
    }

    public int generateRandomCPF() {
        return RANDOM.nextInt(900000000) + 100000000; // Gera CPF entre 100000000 e 999999999
    }

    public int generateRandomAge() {
        return RANDOM.nextInt(101); // Gera idade entre 0 e 100
    }

    @Override
    public int compareTo(Person other){
        return Long.compare(this.age, other.age);
    }

    @Override
    public String toString(){
        return "Name: " + this.name + " Age: " + this.age + " CPF: " + this.CPF + "\n";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
