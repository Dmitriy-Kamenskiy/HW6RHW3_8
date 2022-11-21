package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PersonTest {
    Person person = new Person("Fred", "Morgan",1);
    @Test
    public void testPersonNew() {
        Person person1 = new Person("Fred", "Morgan",1);
        Assertions.assertNotNull(person1);
    }

   @Test
    public void testGenerateList() {
       List<Person> personList = Main.generateClients();
       personList.add(person);
       Assertions.assertEquals(6, personList.size());
   }
   @Test
    public void testUsedReturn() {
        Assertions.assertEquals(1, person.used());
   }

}
