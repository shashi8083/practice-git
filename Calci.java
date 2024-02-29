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