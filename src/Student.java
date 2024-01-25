public class Student extends Person{
    //required fields:
    private double gpa;
    private static final double stipend = 36666.00;

    // toString method
    public String toString() {
        return "Student: " + super.toString();
    }

    //default constructor
    public Student() {
        super();
    }

    //parameterized constructor
    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    //adding getters and setters:
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        return (gpa > 2.67) ? stipend : 0.0;
    }
}