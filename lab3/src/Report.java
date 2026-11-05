public class Report {
    public static void generateReport(Employee[] employees) {
        for (Employee e : employees) {
            System.out.printf("%50s %15.2f%n", e.getFullname(), e.getSalary());
        }
    }
}