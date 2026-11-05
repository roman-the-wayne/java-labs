public class Employee {
    private Double _salary;
    private String _fullName;

    public String getFullname() {
        return _fullName;
    }

    public void setFullname(String fullname) {
        this._fullName = fullname;
    }

    public Double getSalary() {
        return _salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            this._salary = salary;
        }
    }


    public Employee(Double salary, String fullname) {
        this._salary = salary;
        this._fullName = fullname;
    }
}

