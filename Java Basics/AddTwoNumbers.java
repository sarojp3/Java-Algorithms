import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args){
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number:");
        num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of "+ num1 + " and " + num2 + " is: " + sum);
    }
}
