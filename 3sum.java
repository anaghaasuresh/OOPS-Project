import java.util.*;
class three
{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter the first number");
        float a = s1.nextFloat();
        System.out.println("enter the second number");
        float b = s1.nextFloat();
        System.out.println("enter the third number2");
        float c = s1.nextFloat();
        float sum = a+b+c;
        System.out.println("the sum is:"+sum);
        s1.close();
    }
}