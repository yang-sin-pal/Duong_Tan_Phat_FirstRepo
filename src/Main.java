import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputName = sc.next();
        System.out.println("Hello " + inputName + ".\n" + "Welcome to my Repository.");
        System.out.println("new change");
        sc.close();
    }
}