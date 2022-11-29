package person;

import java.util.Objects;

public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean hasSameName(Person person){
        return Objects.equals(person.name, this.name);
    }

    @Override
    public String toString(){
        return "[Name: " + this.name + "]";
    }
}
