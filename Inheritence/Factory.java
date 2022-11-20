import com.sun.corba.se.spi.orbutil.threadpool.Work;

import java.util.Arrays;

public class Factory{
    private Employee [] emps;
    private int numOfEmps;
    private final int MAX_EMPS = 100;

    public Factory(){
        emps = new Employee[MAX_EMPS];
        numOfEmps = 0;
    }


    public boolean addEmployee(Employee e){
        if (numOfEmps + 1 > MAX_EMPS){
            return false;
        } else {
            emps[numOfEmps] = e;
            numOfEmps++;
            return true;
        }
    }

    public int numOfWorkers(){
        return numOfEmps;
    }

    public Manager mostManager(){
        int mostEmployees = 0;
        Manager currentManager = null;
        for(Employee e : emps){
            if (e instanceof Manager){
                if (((Manager) e).getNumOfWorkers() > mostEmployees){
                    mostEmployees = ((Manager) e).getNumOfWorkers();
                    currentManager = (Manager) e;
                }
            }
        }
        return currentManager;
    }

    public Worker minHours(){
        int leastHours = 0;
        Worker currentWorker = null;

        for(Employee e : emps){
            if (e instanceof Worker){
                if (((Worker) e).getHours() < leastHours){
                    leastHours = ((Worker) e).getHours();
                    currentWorker = (Worker) e;
                }
            }
        }
        return  currentWorker;
    }

    public Employee maxSalary(){
        double mostSalary = 0;
        Employee currentEmployee = null;

        for(Employee e : emps){
            //System.out.println(e);
            if (e != null && e.salary() > mostSalary){
               mostSalary = e.salary();
               currentEmployee = e;
            }
        }
        return currentEmployee;
    }

    public Employee getByName(String eName){
        for(Employee e : emps){
            if (e != null && e.getName() == eName){
                return e;
            }
        }
        return null;
    }

    public double salaryByName(String eName){
        for(Employee e : emps){
            if (e != null && e.getName() == eName){
                return e.salary();
            }
        }
        return 0;
    }


    @Override
    public String toString() {
        String str = "Workers in the factory: "+ numOfEmps + "\n" ;
        for(Employee e : emps){
            if (e != null) {
                str = str + "\n" + e.toString();
            }
        }
        return str;
    }
}
