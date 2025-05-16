public class unary
{
    public static void main (String[] args)
    {
        int a = 10;
        int b = a++;
        System.out.println("a=" +a);
        System.out.println("b=" +b);
        int c = 10;
        int d = ++c;
        System.out.println("c="+c);
        System.out.println("d=" +d);

    }
}
// a=11 b=10 c=11 d=11
