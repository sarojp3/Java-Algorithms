import java.util.*;
class CalculatingPowerOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int base, power;
        System.out.print("Enter the base number: ");
        base = sc.nextInt();
        System.out.print("Enter the power number: ");
        power = sc.nextInt();
        int result = 1;
        if(power == 0){
            System.out.print("The result of " + base + " power "+ power + " is " + result);
        }
        else{
            for(int i = 1; i<=power; i++){
                result *= base;
            }
            System.out.print("The result of " + base + " power "+ power + " is " + result);
        }
    }
}
