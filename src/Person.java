public class Person implements Payable, Comparable<Person> {
    //to make od field to be automatically set:
    private static int nextId = 1;
    //creating the fields:
    private int id;
    private String name;
    private String surname;

    //default constructor:
    public Person() {
        this.id = getNextId();
    }

    //parameterized constructor:
    public Person(String name, String surname) {
        this.id = getNextId();
        this.name = name;
        this.surname = surname;
    }

    //adding toString method:
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    //getters and setters:
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(java.lang.String surname) {
        this.surname = surname;
    }

    //adding getPosition method:
    public String getPosition() {
        return "Student";
    }

    //to increase the id by 1
    private static int getNextId() {
        return nextId++;
    }

    //automatic
    @Override
    public double getPaymentAmount() {
        return 0;
    }

    //automatic
    @Override
    public int compareTo(Person otherPerson) {
        return Double.compare(this.getPaymentAmount(), otherPerson.getPaymentAmount());
    }
}
