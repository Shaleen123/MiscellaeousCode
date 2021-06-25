import java.util.Comparator;

public class Employee implements Comparator<Employee> {


    private String name;

    private Integer Age;

    private int salary;

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee() {

    }

    public Employee(String name, Integer Age, int salary) {
        this.name = name;
        this.Age = Age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }




/*   @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }*/
}