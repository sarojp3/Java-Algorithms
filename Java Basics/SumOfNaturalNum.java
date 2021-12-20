import java.util.*;
public class SumOfNaturalNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, result = 0;
        System.out.print("Enter the number upto which you want to sum: ");
        num = sc.nextInt();
        int tmp = num;
        while(num != 0){
            result += num;
            num--;
        }
        System.out.print("The sum of "+ tmp + " natural numbers is: " + result);
    }
}

/* Sum of n Natural Numbers using Recursion

public class SumOfNaturalNum{
    public static int sumNatural(int num){
        if(num != 0){
            return num + sumNatural(num-1);
        }
        else{
            return num;
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.print("Enter the value of num: ");
        num = sc.nextInt();
        System.out.print("The sum is: " + sumNatural(num));

    }

}

 */