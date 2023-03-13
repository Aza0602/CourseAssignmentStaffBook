

public class Main {

    private static final Employee[] EMP = new Employee[10];

    private static void dataEmployee() {
        EMP[0] = new Employee("Петров", "Иван", "Александрович", 1, 25050);
        EMP[1] = new Employee("Петрова", "Иванка", "Александровна", 2, 26050);
        EMP[2] = new Employee("Иванов", "Сергей", "Сергеевич", 3, 30050);
        EMP[3] = new Employee("Семенова", "Александра", "Семенович", 4, 50500);
        EMP[4] = new Employee("Федоров", "Алексей", "Романович", 5, 35050);
        EMP[5] = new Employee("Федотов", "Филлип", "Игоревич", 2, 45050);
        EMP[6] = new Employee("Романенко", "Борис", "Борисович", 4, 29050);
        EMP[7] = new Employee("Борисенко", "Пушкин", "Викторович", 5, 11000);
        EMP[8] = new Employee("Савельева", "Кристина", "Трофимовна", 3, 75000);
        EMP[9] = new Employee("Филимонов", "Трофим", "Григорьевич", 1, 65050);
    }

    public static void main(String[] args) {

    }

    private static void printseparator() {
        System.out.println("---------------------------------------------------------------------------------------------");
    }
    private static void printListOfAllEmployees() {

        for (Employee e : EMP) {
            printseparator();
            System.out.println(e.toString());
        }
    }

    private static float printSumOfSalary() {
        float sum = 0;
        for (Employee employees : EMP) {
            sum = sum + employees.getSalary();
        }
        return sum;
    }

    private static Employee printMinSalary() {
        Employee employee = null;
        float minSalary = Integer.MAX_VALUE;
        for (Employee empl : EMP) {
            if (empl.getSalary() < minSalary) {
                minSalary = empl.getSalary();
                employee = empl;
            }
        }
        return employee;
    }

    private static Employee printMaxSalary() {
        /*        printSeparator();*/
        Employee employee = null;
        float maxSalary = Integer.MIN_VALUE;
        for (Employee empl : EMP) {
            if (empl.getSalary() > maxSalary) {
                maxSalary = empl.getSalary();
                employee = empl;
            }
        }
        return employee;
    }

    private static float printAverageSalary() {
        return printSumOfSalary() / EMP.length;
    }


    private static void printAllNamesEmployees() {
        System.out.println();
        for (Employee allEmp : Main.EMP) {
            printseparator();
            System.out.println(allEmp.getLastName() + " " + allEmp.getName() + " " + allEmp.getSurname());
        }
        printseparator();
    }
}