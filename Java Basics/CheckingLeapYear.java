import java.util.*;
public class CheckingLeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Enter the year you want to check: ");
        year = sc.nextInt();
        boolean isLeap = false;

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeap = true;
                }
                else isLeap = false;
            }else
                isLeap = true;
        }else{
            isLeap = false;
        }

        if(isLeap == true){
            System.out.println(year + " is Leap Year.");
        }
        else{
            System.out.println(year + " is not a Leap Year.");
        }
    }

}
