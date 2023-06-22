public class BmiService {
    public int calculate (int weight, double heightMeter) {
        double bmi = weight / (heightMeter * heightMeter);
        return (int) bmi;
    }
}
