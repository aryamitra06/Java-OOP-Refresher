public class method{

    static int sum(int a, int b)
    {
        return a+b;
    }
    public static void main(String[] args) {

        // without using static
        // method obj = new method();
        // obj.sum(a, b);

        // using static 
        System.out.println(sum(2,4));
    }
}