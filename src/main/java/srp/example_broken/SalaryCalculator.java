package srp.example_broken;

import java.math.BigDecimal;

class SalaryCalculator {

    BigDecimal calculateSalary(EmployeeData employeeData) {
        BigDecimal salary = employeeData.hourlyRate().multiply(employeeData.workedHours());

        updateSalaryReport(salary, employeeData);
        return salary;
    }

    private void updateSalaryReport(BigDecimal salary, EmployeeData employeeData) {
        System.out.println("updating report....");
    }
}
