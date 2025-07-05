public class MedicalUtilities {
    public static double calculateBMI(double weightKg, double heightM) {
        return weightKg / (heightM * heightM);
    }
}


double bmi = BMI.calculateBMI(70, 1.75);
