import java.util.*;
public class AddingComplexNumbers {
    public static void main(String[] args){
        int real, img, r, im, sumr, sumimg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the real part of first complex number: ");
        real = sc.nextInt();
        System.out.print("Enter the imaginary part of first complex number: ");
        img = sc.nextInt();
        System.out.println("The first complex number is: "+ real + " + " + img + "i ");
        System.out.print("Enter the real part of second complex number: ");
        r = sc.nextInt();
        System.out.print("Enter the imaginary part of second complex number: ");
        im = sc.nextInt();
        System.out.println("The second complex number is: "+ r + " + " + im + "i ");
        System.out.println("The sum of two real numbers is: ");
        sumr = real + r;
        sumimg = img + im;
        System.out.print(sumr + " + " + sumimg + "i ");

    }
}
