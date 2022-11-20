public class Worker extends Employee  {
    private double wagePerHour;
    private int hours;

    public Worker(String name,double wage){
        super(name);
        this.wagePerHour = wage;

    }
    public double getWagePerHour() {
        return wagePerHour;
    }

    public void setWagePerHour(double wagePerHour) {
        this.wagePerHour = wagePerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String toString(){
        return "Employee's Name: " + this.getName() + ", wage = " + this.wagePerHour + ", hours = " + this.hours;
    }



    @Override
    public double salary() {
        return this.hours * this.wagePerHour;
    }
}
