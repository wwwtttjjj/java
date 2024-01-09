package Set;

import java.util.Comparator;
import java.util.Objects;

public class Student<T> implements Comparable<Student> {
    @Override
    public int compareTo(Student o) {
        int ageResult = this.age - o.age;
        int nameresult = ageResult == 0? o.name.compareTo(this.name) : ageResult;
        int result = nameresult == 0 ? 1:nameresult;
        return result;
    }

    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
