public class Person {
    private String name;
    private int age;

   
    public Person() {
        this.name = "Tajul";  // Setting default values
        this.age = 20;
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class ICE {
    public static void main(String[] args) {
              Person person1 = new Person();  
        Person person2 = new Person("Shaon", 21);  


        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}