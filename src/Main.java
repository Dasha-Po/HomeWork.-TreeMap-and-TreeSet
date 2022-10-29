import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
// Продемонстрируйте работу этого компаратора, создав в Main.main() список из нескольких людей
// и отсортировав его с помощью компаратора: Collections.sort(СПИСОК, КОМПАРАТОР).
// После чего выведите список на экран.
        List<Person> people = new ArrayList<>();
        people.add(new Person("Hermione", "de Granger", 11));
        people.add(new Person("Ronald", "Weasley", 12));
        people.add(new Person("Harry", "fon Potter", 11));
        people.add(new Person("Luna", "fon de Lovegood", 10));
        System.out.println(people);
        Collections.sort(people, new PersonsSurnameLengthComparator(2));
        System.out.println(people);
    }
}
