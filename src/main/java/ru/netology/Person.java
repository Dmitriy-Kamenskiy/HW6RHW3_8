package ru.netology;
public class Person {
    protected String name;
    protected String lastName;
    protected int ticketNumbers;

    public Person(String name, String lastName, int ticketNumbers) {
        this.name = name;
        this.lastName = lastName;
        this.ticketNumbers = ticketNumbers;
    }
    public int used() {
        return ticketNumbers--;
    }
}
