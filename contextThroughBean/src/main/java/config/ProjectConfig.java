package config;

import beans.Parrot;
import beans.Dog;
import beans.Cat;
import beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans")
public class ProjectConfig {

    @Bean
    public Cat cat() {
        Cat p = new Cat();
        p.setName("Matroskin");
        return p;
    }

    @Bean
    public Dog dog() {
        Dog p = new Dog();
        p.setName("Sharik");
        return p;
    }

    @Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Pasha");
        return p;
    }

    @Bean
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Kesha");
        return p;
    }

    @Bean
    public Person person() {
        Person p = new Person();
        p.setName("Nemo");
        p.setParrot1(parrot1());
        p.setParrot2(parrot2());
        p.setDog(dog());
        p.setCat(cat());
        return p;
    }
}