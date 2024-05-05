import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker("Anna", 1500, 1, "2024-01-01", "profession");
        Worker worker2 = new Worker("Peter", 3500, 2, "2024-01-01", "profession");
        Worker worker3 = new Worker("Kate", 5000, 3, "2023-01-01", "profession");
        Worker worker4 = new Worker("John", 2800, 4, "2023-01-01", "profession");
        Manager manager = new Manager("Martin", 8000, 5, "2023-01-01", "manager");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);


        for (Employee e : employees) {
            System.out.println("- " + e.getName() + " (ID: " + e.hashCode() +
                    ", Position: " + e.getPosition() +
                    ", Hire date: " + e.getHireDate() +
                    ", Salary: " + e.getSalary() + ")");
            e.work();
        }
       
    }
}