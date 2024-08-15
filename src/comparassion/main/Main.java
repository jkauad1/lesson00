package src.comparassion.main;

import src.comparassion.classes.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        int size = 10000;
        List<Person> list = genPerson(size);

        System.out.println("Generated Order:");
        System.out.println(list);

        System.out.println("Organized order:");
        Collections.sort(list);
        System.out.println(list);
    }

    public static List<Person> genPerson(int quantity){
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < quantity; i++){
            Person person = new Person();
            person.setName(person.generateRandomName());
            person.setAge(person.generateRandomAge());
            person.setCPF(person.generateRandomCPF());
            list.add(person);
        }
        return list;
    }
}