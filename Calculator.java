import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("please input symbol:");
    int num1 = 80;
    int num2 = 42;
    String symbol = scanner.next();
    switch (symbol){
        case "+":
            System.out.println("sum = " +(num1 + num2) );
            break;
        case "-":
            System.out.println("subtraction = " + (num1 - num2));
            break;
        case "*":
            System.out.println("multiplication = " + (num1 * num2));
            break;
        case "/":
            System.out.println("division method = " + (num1 / num2));
            break;
        case "%":
            System.out.println("rem = " + (num1 % num2));
            break;
    }
    }
}