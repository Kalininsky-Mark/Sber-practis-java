package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Nemo";
    private final beans.Parrot parrot1;
    private final beans.Parrot parrot2;
    private final beans.Dog dog;
    private final beans.Cat cat;

    @Autowired
    public Person(beans.Parrot parrot1, beans.Parrot parrot2, beans.Dog dog, beans.Cat cat) {
        this.parrot1 = parrot1;
        this.parrot2 = parrot2;
        this.cat = cat;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public beans.Parrot getParrot1() {
        return parrot1;
    }

    public Parrot getParrot2() {
        return parrot2;
    }

    public Dog getDog() {
        return dog;
    }

    public Cat getCat() {
        return cat;
    }

}