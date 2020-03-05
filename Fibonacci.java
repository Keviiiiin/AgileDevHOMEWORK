import java.math.BigInteger;

/**
 * @description: 斐波那契数列
 * @author: iccKevin
 * @create: 2020-03-05 10:25
 **/
public class Fibonacci {
    public static BigInteger of (int n){
        if(n<1)
            return null;
        if(n == 1)
            return BigInteger.ONE;
        int i = 2;
        BigInteger sum = new BigInteger("1");
        BigInteger one = new BigInteger("0");
        while(i <= n){
            sum = sum.add(one);
            one = sum.subtract(one);
            i ++;
        }
        return sum;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            System.out.println(Fibonacci.of(i));
        }

    }
}