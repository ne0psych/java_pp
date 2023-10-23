class calculator 
{
    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }

    public int sub(int n1, int n2)
    {
        int r = n1 - n2;
        return r;
    }
}

public class program11
{
    public static void main(String a[])
    {
        int num1 = 8;
        int num2 = 4;

        calculator calc = new calculator();

        int result = calc.add(num1, num2);
        System.out.println(result);

        int newResult = calc.sub(num1, num2);
        System.out.println(newResult);
    }
}
