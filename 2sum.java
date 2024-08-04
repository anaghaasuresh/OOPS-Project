import java.util.*;
class sumavg
 {
    public static void main(String[] args) 
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = s1.nextInt();
        System.out.print("Enter the second number: ");
        int b = s1.nextInt();
        int sum = a + b;
        int avg = sum/2;

        System.out.println("The sum is " + sum);
        System.out.println("The average is"+ avg);
    }
}
