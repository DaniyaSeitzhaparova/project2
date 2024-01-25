public class Employee extends Person {

    //required fields:
    private String position;
    private double salary;

    //default constructor:
    public Employee() {
        super();

    }
    //parameterized constructor:
    public Employee (String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    //adding toString method:
    public String toString() {
        return "Employee: " + super.toString();
    }

    //getters and setters:
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPaymentAmount() {
        return salary;
    }
}