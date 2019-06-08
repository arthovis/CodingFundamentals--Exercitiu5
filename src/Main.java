import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti anul:");
        int year = input.nextInt();
        if ((year%4==0 && year%100!=0)|| year%400==0){
            System.out.println(year+" este an bisect.");
        } else {
            System.out.println(year+" nu este an bisect");
        }
    }
}
