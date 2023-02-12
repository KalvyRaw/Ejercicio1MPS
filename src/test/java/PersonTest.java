//import static org.junit.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.example.Person;
import org.testng.annotations.Test;

public class PersonTest {
    @Test
    public void edadMediaTestNormal() {
        Person p1 = new Person("Juan", 20, "Male");
        Person p2 = new Person("Juana", 30, "Female");
        Person p3 = new Person("Carlos", 40, "Male");
        Person p4 = new Person("Ana", 50, "Female");
        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        double[] resultadoEsperado = {30.0, 40.0};
        double[] resultadoDado = p1.avergareAgePerGender(persons);
        assertArrayEquals(resultadoEsperado, resultadoDado, 0.01);
    }

    @Test()
    public void edadMediaTeniendoListaVacia() {
        Person person = new Person("Juan", 20, "Male");
        List<Person> persons = new ArrayList<>();
        double[] resultadoEsperado = {0.0, 0.0};
        double[] resultadoDado = person.avergareAgePerGender(persons);
        assertArrayEquals(resultadoEsperado, resultadoDado, 0.01);
    }

    @Test
    public void edadMediaTestConUnSoloGenero() {
        Person p1 = new Person("Juan", 20, "Male");
        Person p2 = new Person("Calos", 30, "Male");
        Person p3 = new Person("Fer", 40, "Male");
        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        double[] resultadoEsperado = {30.0, 0.0};
        double[] resultadoDado = p1.avergareAgePerGender(persons);
        assertArrayEquals(resultadoEsperado, resultadoDado, 0.01);
    }
}

