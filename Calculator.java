
import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        // Variable declaration
        char operator;
        double num1, num2, result;

        // Creating scanner obj
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an operator: + - * / %");
        operator = sc.next().charAt(0); // Scan operator

        System.out.println("Enter your first number: ");
        num1 = sc.nextDouble(); // Scan num1

        System.out.println("Enter your second number: ");
        num2 = sc.nextDouble(); // Scan num2

        switch(operator) {
            case '+': 
                result = num1 + num2; // Arithmetic op -> Add
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2; // Arithmetic op -> Subtract
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2; // Arithmetic op -> Multiply
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                result = num1 / num2; // Arithmetic op -> Divide
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            case '%':
                // Arithmetic op -> Modulus
                result = num1 % num2; // Arithmetic op -> Modulus
                System.out.println(num1 + " % " + num2 + " = " + result);
                break;
        }
        sc.close();
    }
}
