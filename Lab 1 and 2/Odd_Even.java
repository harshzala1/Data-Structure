import java.util.*;
public class Odd_Even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        double n = sc.nextDouble();
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
