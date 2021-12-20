import java.util.*;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long number, reversedNum = 0, rem;
        System.out.print("Enter the integer you want to reverse: ");
        number = sc.nextInt();
        while(number != 0){
            rem = number % 10;
            if(rem == 0){
                System.out.print(0);
            }
            else{
                reversedNum = reversedNum * 10 + rem;
            }
            number = number / 10;

        }
        System.out.print( reversedNum + " is the reversed output of given number.");
    }
}

/*Reversing number using recursion
public class ReverseNumber{
    public static void Reverse(int num){
        if(number < 10){
            System.out.print(num);
            return;
        }
        else{
            System.out.print(num%10);
            ReverseNumber(num/10);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter the number you want to reverse: ");
        number = sc.nextInt();
        ReverseNumber(number);
    }

}

 */