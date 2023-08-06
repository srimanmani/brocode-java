import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        double x;
        double y;
        double z;

        Scanner scanner= new Scanner(System.in);
        System.out.println("enter side x:");
        x=Scanner.nextDouble();
        System.out.println("enter side y:");
        y=Scanner.nextDouble();
        z=Math.sqrt((x*x)+(y*y));
        System.out.println("the hypotonuse is:" +z);
        scanner.close();
    }
}

