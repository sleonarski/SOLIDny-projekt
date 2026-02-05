package ocp.example_fixed;

public interface ReportGenerator {

    void generate(ReportContext reportContext);

    class CSVReportGenerator implements ReportGenerator {
        @Override
        public void generate(ReportContext reportContext) {

        }
    }

    class PDFReportGenerator implements ReportGenerator {
        @Override
        public void generate(ReportContext reportContext) {

        }
    }
}
