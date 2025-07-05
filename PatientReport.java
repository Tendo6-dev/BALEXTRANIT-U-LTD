public class PatientReport {
    // Basic report with just diagnosis
    public void generateReport(String diagnosis) {
        System.out.println("Diagnosis: " + diagnosis);
    }
    
    // Detailed report with diagnosis and treatment
    public void generateReport(String diagnosis, String treatment) {
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Treatment: " + treatment);
    }
    
    // Comprehensive report with additional notes
    public void generateReport(String diagnosis, String treatment, String notes) {
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Treatment: " + treatment);
        System.out.println("Notes: " + notes);
    }
}
