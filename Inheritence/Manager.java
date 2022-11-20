public class Manager extends Employee {
    private double wage;
    private int numOfWorkers;

    public Manager(String name,double wage,int workers){
        super(name);
        this.wage = wage;
        this.numOfWorkers = workers;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getNumOfWorkers() {
        return numOfWorkers;
    }

    public void setNumOfWorkers(int numOfWorkers) {
        this.numOfWorkers = numOfWorkers;
    }

    public String toString() {
        return "Employee's name: "+ this.getName() + ", wage = " + this.wage + ", workers = " + this.numOfWorkers;
    }

    @Override
    public double salary() {
        if (this.numOfWorkers > 20){
            return wage + 1000;
        } else if (this.numOfWorkers > 10) {
            return wage + (50 * (this.numOfWorkers - 10));
        }else {
            return wage;
        }
    }
}
