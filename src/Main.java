import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NegativeNumberException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        try {
            Integer number = scanner.nextInt();
            if (number < 0) throw new NegativeNumberException("Ошибка! Введено отрицательное число");
        } catch (NegativeNumberException exception){
            System.err.println(exception.getMessage());
            exception.printStackTrace();
        } catch (InputMismatchException inputMismatchException) {
            System.err.println("Ошибка! Введено недопустимое значение");
            inputMismatchException.printStackTrace();
        }
    }
}