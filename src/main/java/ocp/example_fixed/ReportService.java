package ocp.example_fixed;

public class ReportService {

    private final ReportGenerator reportGenerator;

    public ReportService(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    void prepareReport(ReportContext reportContext) {
        reportGenerator.generate(reportContext);
    }
}
    