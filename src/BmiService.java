public class BmiService {
    public double calculate(double heightM, double weightKg) {
        return weightKg / Math.pow(heightM, 2);
    }
}
