import java.util.Scanner;
class frequency
{
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the string");
            String str= sc.nextLine();
            System.out.println("enter the character to find");
            char ch=sc.next().charAt(0);
            int freq=0;
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)==ch)
                {
                    freq++;

                }
            }
            System.out.println("the character" +ch+ "appears" +freq+ "times in the string");
            sc.close();
            
                    }
    }
}