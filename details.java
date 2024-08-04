import java.util.*;
class anagha
{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String name,cls;
        int rollno;
        System.out.println("enter your name:");
        name = s1.nextLine();
        System.out.println("enter your class:");
        cls = s1.nextLine();
        System.out.println("enter your roll number:");
        rollno = s1.nextInt();
        System.out.println("your name is:"+name);
        System.out.println("your class is:"+cls);
        System.out.println("your roll number:"+rollno);
        s1.close();
    }
}