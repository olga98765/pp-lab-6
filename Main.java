import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Anna", 1500, 1);
        Worker worker2 = new Worker("Peter", 3500, 2);
        Worker worker3 = new Worker("Kate", 5000, 3);
        Worker worker4 = new Worker("John", 2800, 4);
        Manager manager = new Manager("Martin", 8000, 5);

        
        System.out.println("Salary 1: " + worker1.getSalary());
        worker1.work();
        System.out.println("Salary 2: " + worker2.getSalary());
        worker2.work();
        System.out.println("Salary 3: " + worker3.getSalary());
        worker3.work();
        System.out.println("Salary 4: " + worker4.getSalary());
        worker4.work();
        System.out.println("Salary 5: " + manager.getSalary());
        manager.work();
    }
}