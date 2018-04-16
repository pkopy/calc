import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private SimpleMath simpleMath;
    private BinaryConverter binary;
    private RootsNumber roots;
    private OctalConverter octal;
    private Logarithm logarithm;
    private SinCos sinCos;

    public Menu() {
        scanner = new Scanner(System.in);
        simpleMath = new SimpleMath();
        binary = new BinaryConverter();
        roots = new RootsNumber();
        octal = new OctalConverter();
        logarithm = new Logarithm();
        sinCos = new SinCos();
    }

    public void start() {
        System.out.println("Calculator ver 1.0");


        String answer;

        do {

            System.out.println("Wybierz opcję: ");
            printChoseList();
            checkAnswer(answer = scanner.nextLine());

        } while (!answer.equalsIgnoreCase("exit"));
    }

    private void checkAnswer(String answer) {
        switch (answer) {
            case "1": {
                System.out.println("Podaj liczby które chcesz pomnożyć oddzielone przecinkiem:");
                double[] args = SimpleMath.changeStringToArray(scanner.nextLine(), ",");
                System.out.println(simpleMath.multiply(args));

                break;
            }

            case "2": {
                System.out.println("Podaj dzielną i dzielnik oddzielone przecinkiem:");
                double[] args = SimpleMath.changeStringToArray(scanner.nextLine(), ",");
                System.out.println(simpleMath.divine(args));
                break;
            }

            case "3": {
                System.out.println("Podaj liczbe do konwersji");
                System.out.println(binary.changeToBinary(Integer.valueOf(scanner.nextLine())));
                break;
            }

            case "5": {
                System.out.println("Podaj liczbe do konwersji");
                System.out.println(octal.binaryToOctal(scanner.nextLine()));
                break;
            }

            case "4": {
                System.out.println("Podaj liczbe do konwersji");
                System.out.println(binary.changeToDecimal(scanner.nextLine()));
                break;
            }

            case "6": {
                System.out.println("Podaj stopień pierwiastka oraz liczbę oddzielone przecinkiem:");
                double[] args =(SimpleMath.changeStringToArray(scanner.nextLine(), ","));
                System.out.println(roots.rootsNumber(args));
                break;
            }
            case "7": {
                System.out.println("Podaj podstawę oraz liczbę oddzielone przecinkiem:");
                double[] args =(SimpleMath.changeStringToArray(scanner.nextLine(), ","));
                System.out.println(logarithm.logarithm(args));
                break;
            }

            case "8": {
                System.out.println("Podaj kąt");
                System.out.println(sinCos.sin(Double.valueOf(scanner.nextLine())));
                break;
            }
            case "9": {
                System.out.println("Podaj kąt");
                System.out.println(sinCos.cos(Double.valueOf(scanner.nextLine())));
                break;
            }
            default: {
                System.out.println("Nie ma takiej komendy");
            }

        }

    }

    private void printChoseList() {
        System.out.println();
        System.out.println("1 - mnożenie,");
        System.out.println("2 - dzielenie,");
        System.out.println("3 - zamiana typu dzisiętnego na binarny,");
        System.out.println("4 - zamiana typu binarnego na dziesiętny,");
        System.out.println("5 - zamiana typu binarnego na ósemkowy");
        System.out.println("6 - pierwiastek x z liczby y");
        System.out.println("7 - logarytm z x o podstawie a");
        System.out.println("8 - sinus kąta");
        System.out.println("9 - cosinus kąta");

    }


}
