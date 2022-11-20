package ru.netology;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Person person;
        Queue<Person> personQueue;
        personQueue = (Queue<Person>) generateClients();
        while (!personQueue.isEmpty()){
            person = personQueue.peek();
            System.out.println(person.name + " " + person.lastName + " прокатился");
            person.used();
            personQueue.poll();
            if (person.ticketNumbers > 0) {
                personQueue.offer(person);
            }
        }
    }

    public static List<Person> generateClients() {
        List <Person> persons = new LinkedList<>();
        persons.add(new Person("Петя", "Иванов", 2));
        persons.add(new Person("Рулон", "Обоев", 3));
        persons.add(new Person("Алексей", "Нетоложко", 2));
        persons.add(new Person("Сергей", "Сергеенко", 3));
        persons.add(new Person("Стас", "Кутепов", 3));
        return persons;
    }
}
