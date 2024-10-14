import java.util.Scanner;

public class Main {
    public static void helloName(String name) {
        System.out.println("Hello " + name + "!");
    }
    public static void makeOutWord(String out, String word) {
        System.out.println(out.substring(0, 2) + word + out.substring(2));
    }
    public static void firstHalf(String str) {
        int length = str.length();
        System.out.println(str.substring(0, length / 2));
    }
    public static void nonStart(String a, String b) {
        System.out.println(a.substring(1) + b.substring(1));
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        helloName(text);
        text = sc.nextLine();
        String out = sc.nextLine();
        makeOutWord(out, text);
        text = sc.nextLine();
        firstHalf(text);
        text = sc.nextLine();
        out = sc.nextLine();
        nonStart(text, out);
    }
}