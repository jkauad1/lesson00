package comparassion.main;

import comparassion.classes.Person;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        compare(list);
    }

    public static String[] names = {"Kauã", "Matheus", "Victor", "André", "Danilo", "Romero", "Andreza", "Ana", "Carla", "Maria"};

    static Random random = new Random();
    public static int ages = random.nextInt((900000000) + 100000000);
    public static int CPFs = random.nextInt(1, 101);

    public static void compare(List<Person> list){

        for (int i = 0; i < 101; i++){      //This method uses an empty Array and fill its positions with random attributes for each one.
            Person person = new Person();

            person.setName(names[random.nextInt(names.length)]);
            person.setCPF(random.nextInt(ages));
            person.setAge(random.nextInt(CPFs));

            list.add(person);
        }

        System.out.println("Generated Order:");
        System.out.println(list);

        System.out.println("Organized order:");
        Collections.sort(list);
        System.out.println(list);
    }
}