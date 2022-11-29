package person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemovePeople {
    public static void main(String[] args) {
        Person ben = new Person("Ben");
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(new String("Ben")));
        persons.add(new Person(new String("Alyssa")));
        persons.add(new Person(new String("Alice")));
        persons.removeIf(t -> t.hasSameName(ben));
        
        System.out.println(persons);
        Student test = new Student("Jeff", "A-", "7");
        test.inflateGrade();
        test.boostAttendance();
        System.out.println(test.toString());
    }
}
