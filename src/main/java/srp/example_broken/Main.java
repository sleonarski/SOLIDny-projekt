package srp.example_broken;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        EmployeeData employeeData = new EmployeeData(new BigDecimal(160), new BigDecimal(100));
        salaryCalculator.calculateSalary(employeeData);
    }
}
