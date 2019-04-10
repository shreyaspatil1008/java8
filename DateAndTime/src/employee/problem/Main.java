package employee.problem;

import train.problem.Train;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] a){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Sharavati",10000.00f, LocalDate.now().minus(900,ChronoUnit.DAYS), LocalDate.of(1988,Month.DECEMBER,7)));
        employees.add(new Employee(2,"Sharavati1",10000.00f, LocalDate.now().minus(4000,ChronoUnit.DAYS), LocalDate.of(1968,Month.DECEMBER,17)));
        employees.add(new Employee(3,"Sharavati2",10000.00f, LocalDate.now().minus(4970,ChronoUnit.DAYS), LocalDate.of(1978,Month.DECEMBER,8)));
        employees.add(new Employee(4,"Sharavati3",10000.00f, LocalDate.now().minus(940,ChronoUnit.DAYS), LocalDate.of(1998,Month.DECEMBER,5)));
        employees.add(new Employee(5,"Sharavati4",10000.00f, LocalDate.now().minus(980,ChronoUnit.DAYS), LocalDate.of(1962,Month.DECEMBER,23)));
        employees.add(new Employee(6,"Sharavati5",10000.00f, LocalDate.now().minus(3920,ChronoUnit.DAYS), LocalDate.of(1961,Month.DECEMBER,30)));

        System.out.println("The long distance employees are: ");
        List<String> oldEmployees = new ArrayList<>();
        List<String> toBeRetiredEmployees = new ArrayList<>();
        for (Employee train:employees){
            LocalDate i1 = train.getDateOfJoining();
            LocalDate i2 = LocalDate.now();
            long years = i1.until( i2, ChronoUnit.YEARS);
            if(years > 10){
                oldEmployees.add(train.getName()+" :: "+years+" years");
            }
            i1 = train.getDateOfBirth();
            years = i1.until( i2, ChronoUnit.YEARS);
            if((58-years) < 10){
                toBeRetiredEmployees.add(train.getName()+" :: "+(58-years)+" years");
            }
        }

        System.out.println("Old than 10 years");
        System.out.println(oldEmployees);
        System.out.println("To be retired in 10 years");
        System.out.println(toBeRetiredEmployees);
    }
}
