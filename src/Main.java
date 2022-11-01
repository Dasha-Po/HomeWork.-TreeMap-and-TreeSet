import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        int maxWorlds = 2;
        System.out.println(people);
        Comparator<Person> comparator;
        comparator = (a, b) -> {
            List<String> surname1 = new ArrayList<>();// список для фамилии
            List<String> surname2;
            String s1 = a.getSurname();// получаем фамилию
            String s2 = b.getSurname();
            surname1 = List.of(s1.split("\\P{IsAlphabetic}+"));// фамилию делим на слова и добавляем в список
            surname2 = List.of(s2.split("\\P{IsAlphabetic}+"));
            int i = Integer.compare(surname1.size(), surname2.size());// сравниваем фамилии по количеству слов
            if (surname1.size() >= 2 && surname2.size() >= 2) { // здесь 2 - число слов в фамилии
                return Integer.compare(a.getAge(), b.getAge());
            } else if (i == 0) {
                return Integer.compare(a.getAge(), b.getAge());
            }
            return i;
        };
        Collections.sort(people, comparator);
        System.out.println(people);
    }
}
