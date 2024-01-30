public class factorial {
    public static void main(String[] args)
    {
        System.out.println(factorialLoop(6));
        System.out.println(factorialR(6));


    }
    public static int factorialLoop(int n) //loop
    {
        int result = 1;
        if (n > 1)
        {
            for (int i = 1; i <= n; i++)
            {
                result = result * i;
            }

        }
        return result;
    }

    public static int factorialR(int num) //recursive
        {

            if (num == 0 || num == 1)
                return 1;
            else
                return num * factorialR(num - 1);
        }
    }
