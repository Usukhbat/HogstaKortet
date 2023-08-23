import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = (int) (Math.random() * 51) +1;
        int b = (int) (Math.random() * 51) +1;
        System.out.print("press enter to play");
        String enter = scan.nextLine();
        if (a<b){
            System.out.println("a got "+a+" and b got "+b);
            System.out.println("b won");
            return;
        }
        if (a>b){
            System.out.println("a got "+a+" and b got "+b);
            System.out.println("a won");
            return;
        }
        System.out.println("kör igen");
    }
}