package ocp.example_broken;

public class ReportGenerator {

    public void generate(ReportContext reportContext, ReportType reportType) {
        switch (reportType) {
            case CSV -> generateCSV(reportContext);
            case PDF -> generatePDF(reportContext);
            case null -> System.out.println("Undefined report type");
        }
    }

    private void generateCSV(ReportContext reportContext) {
        // implementation
    }

    private void generatePDF(ReportContext reportContext) {
        // implementation
    }
}
