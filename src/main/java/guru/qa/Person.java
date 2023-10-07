package guru.qa;

public class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void goToPtnsion() {
        if(age > 17) {
            System.out.println("Я, студент :)");
        } else {
            System.out.println("Я ещё не учусь в универе!");
        }
    }
    void sayName() {
        System.out.println("Моё имя: " + name);
    }

}
      
