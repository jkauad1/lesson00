package comparassion.classes;

public class Person implements Comparable <Person> {
    private String name;
    private int CPF;
    private int age;

    public Person (){}

    public Person(String name, int CPF, int number){
        this.name = name;
        this.CPF = CPF;
        this.age = number;
    }

    @Override
    public int compareTo(Person other){
        return Long.compare(this.age, other.age);
    }

    @Override
    public String toString(){
        return "Name: " + this.name + " Age: " + this.age + " CPF: " + this.CPF + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
