package Z2;

public class AnotherT {
    public static void function2(int a, Tester r, int b)
    {
        if(a == 1)
        {
            Tester.info(r);
        }
        else if(a == 2)
        {
            Tester.info(r, b);
        }
        else
        {
            Tester.info();
        }
    }
}
