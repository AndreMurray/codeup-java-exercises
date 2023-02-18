import java.util.Arrays;

public class Person {
    private String name;
    private int age;

    private boolean walking;

    // Constructors
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, boolean walking) {
        this.name = name;
        this.age = age;
        this.walking = walking;
    }

    public Person(String name){
        this.name = name;
        this.age = 0;
    }

    public Person(){
        this.name = "";
        this.age = 0;
    }

    // Methods
    protected void getFood(){

    }


    // Getters & Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Person[] addPerson(Person[] people, Person person) {
        Person[] newPeopleArray = Arrays.copyOf(people, people.length + 1);
        newPeopleArray[people.length - 1] = person;
        return newPeopleArray;
    }




}
