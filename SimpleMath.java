import java.util.Arrays;

public class SimpleMath {

    private double[] multiplyArgs;

    public SimpleMath() {

    }

    public double multiply(double... args) {
        double result = 1;
        for (double arg : args) {
            result *= arg;
        }
        return result;
    }

    private void lenghtOfArgs(int qtyArgs) {
        multiplyArgs = new double[qtyArgs];
        for (int i = 0; i < qtyArgs ; i++) {
            multiplyArgs[i] = 0;
        }

    }

    private void addArg(int i, double arg) {
        multiplyArgs[i] = arg;
    }


    public double divine(double... args) {
        if (args[1] != 0) {
            return args[0]/args[1];
        }
        return 0;
    }

    public double[] getMultiplyArgs() {
        return multiplyArgs;
    }

    public void changeStringToArray (String string, String separator) {
        String[] args = string.split(separator);

        lenghtOfArgs(args.length);
//        System.out.println(logic.toString());

        for (int i = 0; i < args.length; i++) {
            addArg(i, Double.valueOf(args[i]));
        }
    }



}
