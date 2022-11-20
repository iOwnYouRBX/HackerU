public abstract class Employee {
    private String name;


    public String getName() {
        return name;
    }

    public Employee(String name){
        this.name = name;
    }

    public String toString(){
        return "Employee's name: " + this.name;
    }

    public abstract double salary();


}
