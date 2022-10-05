import java.time.LocalDate;

/**
 * -*- coding: gbk -*-
 *
 * @author:赵鑫杰
 * @Time:2022-08-26 16:45
 * @Describle:对雇佣类进行测试
 */
public class EmployeeTest {
    public static void main(String[] args){
        //通过类初始化三个对象
        Employee[] staff = new Employee[3];
        Employee employee = new Employee("Arel", 60000, 1987, 12, 15);

        staff[0] = new Employee("Carl", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony", 40000, 1990, 3, 15);

        for (Employee e:staff)
            e.raiseSalary(5);

        for (Employee e:staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());

        System.out.println(employee.getName());
    }
}

class Employee{
    private final String name;
    private double salary;
    private final LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }
}

