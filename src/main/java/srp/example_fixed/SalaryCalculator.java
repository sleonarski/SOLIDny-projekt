package srp.example_fixed;

import java.math.BigDecimal;

class SalaryCalculator {

    BigDecimal calculateSalary(EmployeeData employeeData) {

        return employeeData.hourlyRate().multiply(employeeData.workedHours());
    }
}
