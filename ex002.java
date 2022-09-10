import java.util.Scanner;
class Jeeva{
    String name;
    String college;
    int age;
    float height;

    public void printJee()
    {
        System.out.println("-----+----+----+--------");

        System.out.print("The Name is :     ");
        System.out.println(this.name);

        System.out.print("The College is:     ");
        System.out.println(this.college);

        System.out.print("The age is:     ");
        System.out.println(this.age);
        
        System.out.print("The Height is:     ");
        System.out.println(this.height);
        System.out.println("____ _____ _____ END _____ _____ _____");
    }

}

public class ex002 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        Jeeva student = new Jeeva();


        System.out.println("-----*----*----*--------");
        System.out.print("Enter the Name :    ");
        student.name=sc.nextLine();

        System.out.print("Enter the College :    ");
        student.college=sc.nextLine();

        System.out.print("Enter the Age :    ");
        student.age=sc.nextInt();

        System.out.print("Enter the height :    ");
        student.height=sc.nextFloat();

        student.printJee();

        
    }   
    
}
