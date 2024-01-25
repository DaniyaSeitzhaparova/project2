import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//creating the interface:
interface Payable {
    double getPaymentAmount();
}

public class Main {

    //printData method:
    public static void printData(Iterable<Person> persons) {
        for (Person person : persons) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge ");
        }
    }
    public static void main(String[] args) {
        //creating the people:
        Employee employee1 = new Employee("Ardaq", "Serikbaev", "Analyst", 89762.12);
        Employee employee2 = new Employee("Ulan", "Almas", "Manager", 108236.00);
        Student student1 = new Student("Nurlan", "Manas", 2.6);
        Student student2 = new Student("Nikita", "Zhuravlev", 3.8);

        //creating the arraylist:
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(employee1);
        persons.add(employee2);
        persons.add(student1);
        persons.add(student2);

        //to sort the list by salary or stipend:
        Collections.sort(persons);

        //to print all the data:
        printData(persons);

    }
}