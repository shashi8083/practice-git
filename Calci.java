import java.util.Scanner;

/**
 * Calci
 */
public interface Calci {

     public int getSum(int n1,int n2);
}

class MyCalci implements Calci{
     @Override
     public int getSum(int n1, int n2) {
          return n1+n2;
     }
}
class DriverClass {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n1 = sc.nextInt();
          int n2 = sc.nextInt();
          MyCalci c = new MyCalci();
          System.out.println("The sum " + n1 + " and " + n2  + " is : "+c.getSum(n1,n2));
     }
}

