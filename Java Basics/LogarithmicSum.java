/* Computes the natural logarithm of 2, by adding up to n terms in the series
1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
where n is a positive integer and input by user.
*/

import java.util.*;
public class LogarithmicSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        float sum = 0, fraction;
        System.out.print("Enter the positive sequence length: ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i % 2 == 0){
                fraction = -(float) 1/i;
            }
            else{
                fraction = (float)1/i;
            }
            sum = sum + fraction;
        }
        System.out.print("The sum of series is: " + sum);
    }
}
