import java.util.*;

class Ex11_11 {
    public static void main(String[] asrgs) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc"); // 중복이라 저장안됨.
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));

        System.out.println(set);
    }
}

// equals()와 hashCode()를 오버라이딩 해야 HashSet이 바르게 동작.
class Person {
    Person() {}
    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person)) return false;

        Person p = (Person)o;
        // 나 자신(this)의 이름과 나이를 P와 비교
        return this.name.equals(p.name) && this.age==p.age;
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        //  int hash(Objects... values); // 가변인자
        return Objects.hash(name, age);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name +":"+ age;
    }
}
