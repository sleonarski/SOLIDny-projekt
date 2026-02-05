package srp.example_fixed;

import java.math.BigDecimal;

class SalaryReportService {

    private final SalaryCalculator salaryCalculator;
    private final SalaryReportUpdater salaryReportUpdaters;

    SalaryReportService(SalaryCalculator salaryCalculator, SalaryReportUpdater salaryReportUpdaters) {
        this.salaryCalculator = salaryCalculator;
        this.salaryReportUpdaters = salaryReportUpdaters;
    }

    void prepareSalaryReport(EmployeeData employeeData) {
        BigDecimal salary = salaryCalculator.calculateSalary(employeeData);
        salaryReportUpdaters.updateSalaryReport(salary, employeeData);
    }
}
