public class varargs {

    public static int sum(int ...arr)
    {
        int result = 0;
        for (int i : arr) {
            result = result+i;
        }
        return result;
    }

    public static int mul(int x, int ...arr)
    {
        int result = 1;
        int num = x;
        for (int i : arr) {
            result = result * num *i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum is: "+ sum()); 
        System.out.println("The sum is: "+ sum(1));
        System.out.println("The sum is: "+ sum(1,2));
        System.out.println("The sum is: "+ sum(1,2,5));

        // System.out.println("The mul is: "+ mul()); -> It will through an error because mul method requires min 1 argument
        System.out.println("The mul is: "+ mul(1,2,5,4)); 

    }
}
