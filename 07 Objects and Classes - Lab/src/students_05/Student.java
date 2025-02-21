package students_05;

public class Student {
    //характеристики - firstName, lastName, age, hometown.
    private String firstName;
    private String lastName;
    private int age;
    private String hometown;

    //constructor -> public custom
    public Student(String firstName, String lastName, int age, String hometown) {
        //празен обект
        // firstName = null;
        // lastName = null;
        // age = null;
        // hometown = null;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    //getter - ми дава достъп до полетата
    public String getHometown() {
        return hometown;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
