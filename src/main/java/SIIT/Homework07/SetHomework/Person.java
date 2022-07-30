package SIIT.Homework07.SetHomework;

public class Person  {
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    protected String name;
    protected Integer age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + " age: " + age;
    }

}



