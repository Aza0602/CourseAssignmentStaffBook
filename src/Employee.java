public class Employee {
    private final String lastName;
    private final String name;
    private final String surname;
    private int department;
    private float salary;
    private static int counter;
    private final int id;

    public Employee(String lastName, String name, String surname, int department, float salary) {
        this.lastName = lastName;
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        id = ++counter;

    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("id: %d. | ФИО: %-15s %-15s %-15s | Зарплата: %-6.1f | Отдел: %-3d", id, lastName, name, surname, salary,department);
    }
}
