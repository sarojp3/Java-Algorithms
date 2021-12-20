import java.util.*;
public class CheckingOddandEven {
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the you want to check: ");
        num = sc.nextInt();
        if(num % 2 == 0){
            System.out.print(num + " is even number.");
        }
        else{
            System.out.print(num + " is odd number.");
        }
    }
}

