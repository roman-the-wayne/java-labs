public class Task3 {
    public static void main(String[] args){
        Employee[] employees = new Employee[3];

        Employee employee1 = new Employee(1500.0, "Носачевский Роман Денисович");
        Employee employee2 = new Employee(2500.0, "Носачевский Роман Денисович");
        Employee employee3 = new Employee(3400.0, "Носачевский Роман Денисович");

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;

        Report.generateReport(employees);



    }
}
