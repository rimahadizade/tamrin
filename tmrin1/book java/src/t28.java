import java.util.Scanner;

public class t28 {

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        int name1 = name.nextInt();
        if (name1 < 3) {

            for (int i = 1; i < 4; i++)

                System.out.println("rima");
        } else {
             for(int i=0 ; i<2 ; i++)
            System.out.println("ALA");


        }
    }
}



