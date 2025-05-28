import java.util.Scanner;
public class UserInput{
    public static void main(String[] args){
        // classname referances = new classname(); for creating an object
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The value of a is: " + a);

        float f = sc.nextFloat();
        System.out.println("This is a float: " + f);

        double d = sc.nextDouble();
        System.out.println("This is a double: " + d);
    }
}