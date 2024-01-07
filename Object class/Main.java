public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Shlomo", 80);
        Person person2 = new Person("Shlomo", 80);

        boolean isEqualsPerson = person1.equals(person2);
        System.out.println(isEqualsPerson);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}