import java.util.Scanner;

public class calc {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    try {
    System.out.print("Digit a number a : ");
    double a = input.nextInt();
    System.out.print("Digit a number b : ");
    double b = input.nextInt();

    double s = a+b;
    double r = a-b;
    double m = a*b;
    double d = a/b;

    double raiz = Math.sqrt(a);    
    double p = Math.pow(a, b);

    System.out.println(">> "+a+" + "+b+" = "+s);
    System.out.println(">> "+a+" - "+b+" = "+r);
    System.out.println(">> "+a+" * "+b+" = "+m);
    System.out.println(">> "+a+" / "+b+" = "+d);

    System.out.println(">> The square root of "+a+" is "+raiz);
    System.out.println(">> "+a+" ^ "+b+" = "+p);

    } finally {  input.close(); }
  }
}