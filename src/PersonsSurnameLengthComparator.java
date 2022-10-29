import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Ваша задача написать класс-компаратор, который сравнивал бы людей по принципу знатности:
//        У кого больше слов в фамилии, тот более знатен
//        Если количества слов в фамилии одинаковы, то знатен больше тот, кто старше
public class PersonsSurnameLengthComparator implements Comparator<Person> {

    protected int maxWolds;

    @Override
    public int compare(Person o1, Person o2) {
        List<String> surname1 = new ArrayList<>();// список для фамилии
        List<String> surname2 = new ArrayList<>();
        String s1 = o1.getSurname();// получаем фамилию
        String s2 = o2.getSurname();
        surname1 = List.of(s1.split("\\P{IsAlphabetic}+"));// фамилию делим на слова и добавляем в список
        surname2 = List.of(s2.split("\\P{IsAlphabetic}+"));
        int i = Integer.compare(surname1.size(), surname2.size());// сравниваем фамилии по количеству слов
        if (surname1.size() >= maxWolds && surname2.size() >= maxWolds) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else if (i == 0) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return i;
    }

    // Добавьте в ваш компаратор конструктор, в котором указывается максимальное количество слов в фамилии,
    // которое имеет смысл при сравнении. Т.е. теперь мы будем при сравнении двух людей считать,
    // что если обе фамилии состоят из количества слов не меньше чем число, указанное в конструкторе,
    // то обе фамилии равнозначны и по ним нельзя определить знатность (что нужно продолжать сравнение
    // уже по возрасту).
    public PersonsSurnameLengthComparator(int maxWolds) {
        this.maxWolds = maxWolds;
    }
}
