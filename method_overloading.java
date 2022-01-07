public class method_overloading {
    static void hello()
    {
        System.out.println("Hello!");
    }
    static void hello(int a)
    {
        System.out.println("Hello! "+a);
    }
    static void hello(int a, int b)
    {
        int sum = a+b;
        System.out.println("Hello! The total is " +sum);
    }
    public static void main(String[] args) {
        hello();
        hello(5);
        hello(8, 9);
    }
}
