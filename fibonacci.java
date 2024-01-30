public class fibonacci
    //methods for loop and recursive fibonacci
{
    public static void main(String[] args) {
        System.out.println(fibloop(50));
        System.out.println(fibrec(50 ));

    }
    public static long fibloop(long num) //loop
    {
         if(num <= 1) {
            return num;
        }
        long fib2 = 1;
        long fib1 = 1;

        for(int i=2; i<num; i++) {
            long temp = fib2;
            fib2+= fib1;
            fib1 = temp;

        }
        return fib2;
    }
    public static long fibrec(long n) //recursive
    {
        if (n <= 1)
            return n;
        return fibrec(n - 1) + fibrec(n - 2);
    }
}
