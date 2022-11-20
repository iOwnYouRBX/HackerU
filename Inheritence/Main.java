public class Main {
    public static void main(String[] args) {
       Factory factory = new Factory();

        Worker worker = new Worker("Ron",3);
        worker.setHours(500);
        factory.addEmployee(worker);

        Manager manager = new Manager("Manager",5000,25);
        factory.addEmployee(manager);

        System.out.println(worker);
        System.out.println(worker.salary());

        System.out.println(manager);
        System.out.println(manager.salary());

        System.out.println(factory.numOfWorkers());
        System.out.println(factory.mostManager());
        System.out.println(factory.minHours());
        System.out.println(factory.maxSalary());
        System.out.println(factory.getByName("Ron"));
        System.out.println(factory.salaryByName("Manager"));
        System.out.println(factory);







    }
}
