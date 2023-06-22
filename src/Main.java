public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 50;
        double heightMeter = 1.7;
        int bmi = service.calculate (weight, heightMeter);
        System.out.println("Ваш индекс массы тела " + (bmi));
    }
}

