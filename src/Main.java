import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner actionWithNumbers = new Scanner(System.in);

        double numbers1, numbers2, result;
        String action;

        System.out.print("Введіть перше число: ");
        numbers1 = Double.parseDouble(actionWithNumbers.nextLine());

        System.out.print("Введіть друге число: ");
        numbers2 = Double.parseDouble(actionWithNumbers.nextLine());

        System.out.print("Введіть дію для чисел (+, -, *, /): ");
        action = actionWithNumbers.nextLine();

        if(action.equals("+") || action.equals("Додавання")) {
            result = numbers1 + numbers2;
        } else if(action.equals("-") || action.equals("Відніманя")) {
            result = numbers1 - numbers2;
        } else if (action.equals("*") || action.equals("Множення")) {
            result = numbers1 * numbers2;
        } else if (action.equals("/") || action.equals("Ділення")) {
            result = numbers1 / numbers2;
        } else {
            result = 0;
        }

        if(action.equals("/") && numbers2 == 0 || numbers1 == 0) {
            System.out.println("Помилка");
            return;
        }

        System.out.println("Результат: " + result);

    }
}
