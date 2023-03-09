import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Person john = new Person("john", "Johnmail", 675171831);
        System.out.println(john);

    }
}

class Person{
    private String name;
    private String email;
    private int number;

    public Person(String name, String email, int number) {
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", number=" + number +
                '}';
    }
}



class Number{
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Number{" +
                "number=" + number +
                '}';
    }
}
