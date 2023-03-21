public class BmiService {

    public int calculate(int weight_kilogram, double height_meter) {
        int result;

        double height_total = height_meter * height_meter;
        result = (int) (weight_kilogram / height_total);

        return result;
    }

}
