package Week02;
import java.util.Scanner;

public class Week02_04 {
  public static void main(String[] arg){
    //add code here
    Scanner scanner = new Scanner(System.in);

    float a = scanner.nextFloat();
    String oper = scanner.next();
    float b = scanner.nextFloat();

    float p = a + b;
    float m = a - b;
    float q = a * b;
    float n = a / b;
    if(oper.equals("+")) {
      System.out.println(a +" + "+ b +" = "+ p);
    }
    else if(oper.equals("-")) {
      System.out.println(a +" - "+ b +" = "+ m);
    }
    else if(oper.equals("*")) {
      System.out.println(a +" * "+ b +" = "+ q);
    }
    else if(oper.equals("/") && b == 0) {
      System.out.println("False");
    }
    else if(oper.equals("/")) {
      System.out.println(a +" / "+ b +" = "+ n);
    }

    scanner.close();
  }
}