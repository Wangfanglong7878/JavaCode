import java.util.Scanner;
public class Calculator2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome use simple calculator system!");
        System.out.println("please input num1:");
        int num1 = scanner.nextInt();
        System.out.println("please input symbol:");
        String symbol = scanner.next();
        System.out.println("please input num2:");
        int num2 = scanner.nextInt();
        switch (symbol){
            case "+":
                System.out.println("sum = " + (num1 + num2));
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
                System.out.println("complementation = " + (num1 % num2));
                break;
        }
    }
}