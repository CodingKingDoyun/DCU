package Week02;
import java.util.Scanner;

public class Week02_03 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();

    boolean answer = false;
    if ((x1 >= 100 && x1 <= 200) && (y1 >= 100 && y1 <= 200) || (x2 >= 100 && x2 <= 200) && (y2 >= 100 && y2 <= 200)) {
      answer = true;
    }

    if (answer) {
      System.out.println("True");
    } else System.out.println("False");

    sc.close();
  }
}