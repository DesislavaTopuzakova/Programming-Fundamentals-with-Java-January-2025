package demo;

public class Animal {
    //1. Fields
    private String name;
    private String type;
    private int age;

    //2. Constructor
    public Animal(String name, String type, int age) {
        //this
        this.name = name;
        this.type = type;
        this.age = age;
    }

    //3. Methods
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public void setType(String newType) {
        this.type = newType;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }
}
