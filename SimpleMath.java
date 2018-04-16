
public class SimpleMath {

    private static double[] multiplyArgs;

    private static void lengthOfArgs(int qtyArgs) {
        multiplyArgs = new double[qtyArgs];
        for (int i = 0; i < qtyArgs ; i++) {
            multiplyArgs[i] = 0;
        }

    }

    private static void addArg(int i, double arg) {
        multiplyArgs[i] = arg;
    }

    public static double[] changeStringToArray (String string, String separator) {
        String[] args = string.split(separator);
        lengthOfArgs(args.length);
        for (int i = 0; i < args.length; i++) {
            addArg(i, Double.valueOf(args[i]));
        }
        return multiplyArgs;
    }

    public double multiply(double... args) {
        double result = 1;
        for (double arg : args) {
            result *= arg;
        }
        return result;
    }

    public double divine(double... args) {
        if (args[1] != 0) {
            return args[0]/args[1];
        }
        return 0;
    }


}
