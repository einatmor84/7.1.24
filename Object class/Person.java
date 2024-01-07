import java.util.Objects;
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeAsound(){
        System.out.println("sound of an animal");
    }

    @Override
    public String toString() {
        return this.name + ", age: " +  this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
