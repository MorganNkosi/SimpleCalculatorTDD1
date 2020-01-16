//MorganNkosi
public class Calculator {
    public static int add(int a, int b)
    {
        return a + b;
    }

    public static int multiply(int a, int b)
    {
        return a * b;
    }

    public static int multipleAdd(int...x)
    {
        int sum = 0;
        for (int i = 0; i < x.length ; i++)
        {
            sum += x[i];
        }
        return sum;
    }

    public static int multipleProduct(int...x)
    {
        int sum = 1;
        for (int i = 0; i < x.length ; i++)
        {
            sum *= x[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = add(2,8);
        System.out.println(sum);

        int product = multiply(2,8);
        System.out.println(product);

        int sumMultiple = multipleAdd(2,5,8);
        System.out.println(sumMultiple);

        int byMultiple = multipleProduct(2,5,8);
        System.out.println(byMultiple);
    }
}
