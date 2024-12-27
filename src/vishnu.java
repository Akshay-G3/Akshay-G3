import java.util.Scanner;

public class vishnu {
    public static int sum(int a,int b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.println("the sum of the numbers = "+sum(a,b));
    }
}