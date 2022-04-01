import java.util.Scanner;

public class Main {
    static StringCalculator calculator = new StringCalculator(new BigNumberLogger());

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String numbers = input.substring(5, input.length()-1);
            int result = calculator.Add(numbers);
                    System.out.println(result);
        }
    }
}
