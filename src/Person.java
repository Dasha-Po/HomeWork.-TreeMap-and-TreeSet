public class Person {
    private String name;
    private String surname;
    private int age;

    //конструктор на все поля
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // создайте геттеры и сеттеры
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String s) {
        name = s;
    }

    public void setSurname(String s) {
        surname = s;
    }

    public void setAge(int i) {
        age = i;
    }

    // создайте toString
    @Override
    public String toString() {
        return name + " " + surname;
    }
}
