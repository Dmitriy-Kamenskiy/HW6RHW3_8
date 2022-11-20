package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    Person person = new Person("Fred", "Morgan",1);
    @Test
    public void testPersonNew() {
        Person person1 = new Person("Fred", "Morgan",1);
        Assertions.assertNotNull(person1);
    }

   @Test
    public void testPersonObject() {
        Assertions.assertSame(person,person.name);
   }
   @Test
    public void testUsedReturn() {
        Assertions.assertEquals(1, person.used());
   }

}
