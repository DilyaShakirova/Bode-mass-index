public class BmiService {
    public int calculate(double heightM, double weightKg) {
        double index = weightKg / Math.pow(heightM, 2);
        return (int) index;
    }
}
