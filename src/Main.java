public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight_kilogram = 112;
        double height_meter = 1.96;
        int Bmi = service.calculate(weight_kilogram, height_meter);
        System.out.println(Bmi);
    }
}