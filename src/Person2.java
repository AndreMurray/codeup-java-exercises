public class Person2 {
    public String name;

    public Person2(String pat) {
        this.name = pat;
    }

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello, this  is " + this.name);
    }

    public static void main(String[] args) {
//        Person2 newPerson = new Person2();
//        newPerson.setName("Pat");
//        System.out.println(newPerson.getName());
//        newPerson.sayHello();

//        Person2 person1 = new Person2("John");
//        Person2 person3 = new Person2("John");
//        System.out.println(person1.getName().equals(person3.getName()));
//        System.out.println(person1 == person2);

    }
}
