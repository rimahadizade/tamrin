import java.util.Scanner;

public class input {

    public static void main (String[]args){
        //creat a scanner object
        Scanner rima=new Scanner(System.in);

        // prompt the user to enter a radius
        System.out.print("Enter a number for radius:");
        double radious = rima.nextDouble();

        //comute area
        double area = radious * radious * 3.14;

        //display results
        System.out.println (("The area for the circle of radius")+ radious+  "is"+  area );

    }
}
