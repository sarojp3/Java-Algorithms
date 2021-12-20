import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args){
        int n, firstNum = 0, secondNum = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many number you want to print: ");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(firstNum + ", ");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }

}


/* Generating Fibonacci Series using Recursion

public class FibonacciSeries{
    public static int genFib(int num){
        if(num == 0 ){
            return 0;
        }
        if(num == 1 || num == 2){
            return 1;
        }
        else{
            return genFib(num-1) + genFib(num-2);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter how many number you want to print: ");
        num = sc.nextInt();
        for(int i= 0; i<num;i++)
            System.out.print(genFib(i) + " ");
    }
}


 */


