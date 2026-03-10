package Week02;
import java.util.Scanner;

public class Week02_01
{
  public static void calcu(int money) {
    int tmp;
    if (money / 50000 > 0) {
      tmp = money / 50000;
      System.out.print(tmp + " 50,000won bill");
      if(tmp > 1) System.out.print("(s)");
      money %= 50000;
      System.out.println();
    }

    if (money / 10000 > 0) {
      tmp = money / 10000;
      System.out.print(tmp + " 10,000won bill");
      if(tmp > 1) System.out.print("(s)");
      money %= 10000;
      System.out.println();
    }

    if (money / 1000 > 0) {
      tmp = money / 1000;
      System.out.print(tmp + " 1,000won bill");
      if(tmp > 1) System.out.print("(s)");
      money %= 1000;
      System.out.println();
    }

    if (money / 500 > 0) {
      tmp = money / 500;
      System.out.print(tmp + " 500won coin");
      if(tmp > 1) System.out.print("(s)");
      money %= 500;
      System.out.println();
    }

    if (money / 100 > 0) {
      tmp = money / 100;
      System.out.print(tmp + " 100won coin");
      if(tmp > 1) System.out.print("(s)");
      money %= 100;
      System.out.println();
    }

    if (money / 50 > 0) {
      tmp = money / 50;
      System.out.print(tmp + " 50won coin");
      if(tmp > 1) System.out.print("(s)");
      money %= 50;
      System.out.println();
    }

    if (money / 10 > 0) {
      tmp = money / 10;
      System.out.print(tmp + " 10won coin");
      if(tmp > 1) System.out.print("(s)");
      money %= 10;
      System.out.println();
    }

    if (money / 1 > 0) {
      tmp = money / 1;
      System.out.print(tmp + " 1won coin");
      if(tmp > 1) System.out.print("(s)");
      money %= 1;
      System.out.println();
    }
  }

  public static void main(String[] arg){
    Scanner scanner = new Scanner(System.in);

    int money = scanner.nextInt();
    calcu(money);

    scanner.close();
  }
}