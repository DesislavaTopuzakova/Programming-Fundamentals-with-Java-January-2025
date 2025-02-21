package OrderByAge_06;

public class Person {

    private String name;
    private String id;
    private int age;

    public Person(String name, String id, int age) {

        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
}
