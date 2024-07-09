package tests;

import beans.Parrot;
import beans.Person;
import beans.Dog;
import beans.Cat;
import config.ProjectConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ProjectConfig.class})
public class AppTests {

    @Autowired
    private ApplicationContext context;

    @Test
    @DisplayName("Test that a Cat instance named Matroskin has been added to the Spring context")
    public void testMatroskinIsInTheSpringContext() {
        Cat p = context.getBean(Cat.class);

        assertEquals("Matroskin", p.getName());
    }

    @Test
    @DisplayName("Test that a Dog instance named Sharik has been added to the Spring context")
    public void testSharikIsInTheSpringContext() {
        Dog p = context.getBean(Dog.class);

        assertEquals("Sharik", p.getName());
    }

    @Test
    @DisplayName("Test that a Parrot instance named Pasha has been added to the Spring context")
    public void testPashaIsInTheSpringContext() {
        Parrot p = context.getBean("parrot1", Parrot.class);

        assertEquals("Pasha", p.getName());
    }

    @Test
    @DisplayName("Test that a Parrot instance named Kesha has been added to the Spring context")
    public void testKeshaIsInTheSpringContext() {
        Parrot p = context.getBean("parrot2", Parrot.class);

        assertEquals("Kesha", p.getName());
    }


    @Test
    @DisplayName("Test that a Person instance has been added to the Spring context")
    public void testNemoIsInTheSpringContext() {
        Person p = context.getBean(Person.class);

        assertEquals("Nemo", p.getName());
    }

    @Test
    @DisplayName("Test that the Person instance in the Spring context" +
            "owns the Cat instance named Matroskin from the Spring context")
    public void testNemoOwnsMatroskin() {
        Person p = context.getBean(Person.class);

        assertNotNull(p.getDog());
        assertEquals("Matroskin", p.getCat().getName());
    }


    @Test
    @DisplayName("Test that the Person instance in the Spring context" +
            "owns the Dog instance named Sharik from the Spring context")
    public void testNemoOwnsSharik() {
        Person p = context.getBean(Person.class);

        assertNotNull(p.getParrot1());
        assertEquals("Sharik", p.getDog().getName());
    }


    @Test
    @DisplayName("Test that the Person instance in the Spring context" +
            "owns the Parrot instance named Pasha from the Spring context")
    public void testNemoOwnsPasha() {
        Person p = context.getBean(Person.class);

        assertNotNull(p.getParrot1());
        assertEquals("Pasha", p.getParrot1().getName());
    }

    @Test
    @DisplayName("Test that the Person instance in the Spring context" +
            "owns the Parrot instance named Kesha from the Spring context")
    public void testNemoOwnsKesha() {
        Person p = context.getBean(Person.class);

        assertNotNull(p.getParrot2());
        assertEquals("Kesha", p.getParrot2().getName());
    }
}