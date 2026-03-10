package Week02;
import java.util.Scanner;

public class Week02_02 {
  public static void calcu(int a, int b, int c) {
    int num = b + c;
    int max = a;

    if (max < b) {
      max = b;
      num = a + c;
    }

    if (max < c) {
      max = c;
      num = a + b;
    }
    if (num > max) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }

  }

  public static void main(String[] arg){
    //add code here
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    calcu(a,b,c);

    scanner.close();
  }
}