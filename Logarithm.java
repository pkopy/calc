public class Logarithm {

    public double logarithm(double... args) {
        if (args[0] > 1 && args[1] > 0) {
            int count = 0;

            for (int i = 2; i < args[1]; i++) {
                int result = 1;
                for (int j = 1; j <= i; j++) {
                    result *= args[0];
                }
                if (result == args[1]) {
                    return i;
                }
                if (result > args[1]) {
                    return decimal(args[0], args[1], i - 1);
                }
            }
        }
        return 0;
    }


    private double decimal(double base, double number, int intNumber) {
        double result;
        double index = intNumber;

        for (int i = 1; i < 10; i++) {
            index += 0.1;
            double pow = (index * 10) / 10;
            result = Math.pow(base, pow);

            if (result > number) {
                return index - 0.1;
            }
        }
        return 0;
    }

//    public double
}
