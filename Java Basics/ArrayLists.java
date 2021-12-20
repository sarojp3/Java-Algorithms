import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Renault");
        cars.add("Mercedes");
        cars.add("Ferrari");
        cars.add("Lamborghini");

        for (String s : cars) {
            System.out.println(s);
        }

        String delCar;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which car you want to delete: ");
        delCar = sc.nextLine();
        if(delCar.isBlank()){
            System.out.println("Value must not be empty!!");
        }
        else{
            cars.remove(delCar);
        }
        for (String car : cars) {
            System.out.println(car);
        }

        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(4);
        nums.add(3);
        nums.add(5);
        nums.add(7);
        nums.add(1);
        for(Integer n : nums){
            System.out.print(n + "\t" );
        }
        System.out.println("\nThe sorted array is: ");
        Collections.sort(nums);
        for(Integer no: nums){
            System.out.print(no + "\t");
        }





    }
}
