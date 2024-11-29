import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String yourName = sc.next();
        System.out.println("Hello "+yourName+".\n"+"Welcome to my Repository.");
        sc.close();
    }
}